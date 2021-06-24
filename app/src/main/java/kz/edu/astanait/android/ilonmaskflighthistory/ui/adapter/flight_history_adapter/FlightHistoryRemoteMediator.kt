package kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter

import androidx.paging.ExperimentalPagingApi
import androidx.paging.LoadType
import androidx.paging.PagingState
import androidx.paging.RemoteMediator
import kz.edu.astanait.android.ilonmaskflighthistory.application.FlightHistoryApplication
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.RemoteKeys
import kz.edu.astanait.android.ilonmaskflighthistory.model.remote.retrofit.Common
import java.io.InvalidObjectException

@ExperimentalPagingApi
class FlightHistoryRemoteMediator : RemoteMediator<Int, FlightHistory>() {
    override suspend fun load(
        loadType: LoadType,
        state: PagingState<Int, FlightHistory>
    ): MediatorResult {

        val flightHistoryDao = FlightHistoryApplication.database.getFlightHistoryDao()
        val remoteKeysDao = FlightHistoryApplication.database.getRemoteKeysDao()

        return try {

            // Judging the page number
            val page = when (loadType) {
                LoadType.APPEND -> {

                    val remoteKey =
                        getLastRemoteKey(state) ?: throw InvalidObjectException("Inafjklg")
                    remoteKey.nextKey
                        ?: return MediatorResult.Success(endOfPaginationReached = true)

                }
                LoadType.PREPEND -> {
                    return MediatorResult.Success(endOfPaginationReached = true)
                }
                LoadType.REFRESH -> {
                    val remoteKey = getClosestRemoteKeys(state)
                    remoteKey?.nextKey?.minus(1) ?: 1
                }
            }

            // make network request
            val response =
                Common.flightHistoryService.getFlightHistory(offset = state.config.pageSize)
            val endOfPagination = response.body()?.size!! < state.config.pageSize

            if (response.isSuccessful) {

                response.body()?.let {

                    // flush our data
                    if (loadType == LoadType.REFRESH) {
                        flightHistoryDao.clearFlightHistory()
                        remoteKeysDao.clearRemoteKeys()
                    }


                    val prev = if (page == 1) null else page - 1
                    val next = if (endOfPagination) null else page + 1


                    val list = response.body()?.map { flightHistory ->
                        RemoteKeys(flightHistory.flightNumber, prev, next)
                    }


                    // make list of remote keys

                    if (list != null) {
                        remoteKeysDao.insertAll(list)
                    }

                    // insert to the room
                    flightHistoryDao.insertFlightHistoryPagingData(it)


                }
                MediatorResult.Success(endOfPagination)
            } else {
                MediatorResult.Success(endOfPaginationReached = true)
            }


        } catch (e: Exception) {
            MediatorResult.Error(e)
        }

    }

    private suspend fun getClosestRemoteKeys(state: PagingState<Int, FlightHistory>): RemoteKeys? {

        return state.anchorPosition?.let {
            state.closestItemToPosition(it)?.let { flightHistory ->
                FlightHistoryApplication.database.getRemoteKeysDao()
                    .remoteKeysDoggoId(flightHistory.flightNumber)
            }
        }

    }

    private suspend fun getLastRemoteKey(state: PagingState<Int, FlightHistory>): RemoteKeys? {
        return state.lastItemOrNull()?.let {
            FlightHistoryApplication.database.getRemoteKeysDao().remoteKeysDoggoId(it.flightNumber)
        }
    }

}