package kz.edu.astanait.android.ilonmaskflighthistory.model.repository.flight_history

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter.FlightHistoryDataSource
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter.FlightHistoryRemoteMediator

class FlightHistoryRepositoryImpl : FlightHistoryRepository {
    @ExperimentalPagingApi
    override fun downloadFlightHistory(): Flow<PagingData<FlightHistory>> {
        return Pager(
            config = PagingConfig(
                pageSize = 10,
                enablePlaceholders = false
            ),
            initialKey = null,
            pagingSourceFactory = {
                FlightHistoryDataSource()
            },
            remoteMediator = FlightHistoryRemoteMediator()
        ).flow

    }
}