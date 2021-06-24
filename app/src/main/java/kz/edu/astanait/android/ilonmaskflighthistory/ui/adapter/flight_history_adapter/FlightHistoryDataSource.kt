package kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.model.remote.retrofit.Common
import retrofit2.HttpException
import java.io.IOException

class FlightHistoryDataSource : PagingSource<Int, FlightHistory>() {
    override fun getRefreshKey(state: PagingState<Int, FlightHistory>): Int? =
        state.anchorPosition

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, FlightHistory> {

        val pageIndex = params.key ?: 1

        return try {
            val data = Common.flightHistoryService.getFlightHistory(
                offset =
                pageIndex
            )
            Log.d("FH", "load: ${data.body()}")
            LoadResult.Page(
                data = data.body()!!,
                prevKey = null,
                nextKey = if (data.body()!!.isEmpty()) null else pageIndex + 10
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }
}