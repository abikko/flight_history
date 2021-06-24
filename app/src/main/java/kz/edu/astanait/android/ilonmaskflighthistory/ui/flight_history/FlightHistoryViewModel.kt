package kz.edu.astanait.android.ilonmaskflighthistory.ui.flight_history

import android.util.Log
import androidx.lifecycle.viewModelScope
import androidx.paging.*
import kotlinx.coroutines.flow.Flow
import kz.edu.astanait.android.ilonmaskflighthistory.application.FlightHistoryApplication
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.model.repository.flight_history.FlightHistoryRepository
import kz.edu.astanait.android.ilonmaskflighthistory.model.repository.flight_history.FlightHistoryRepositoryImpl
import kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter.FlightHistoryRemoteMediator
import kz.edu.astanait.android.ilonmaskflighthistory.ui.base_classes.BaseViewModel

class FlightHistoryViewModel : BaseViewModel() {

    var repository: FlightHistoryRepository = FlightHistoryRepositoryImpl()

    @ExperimentalPagingApi
    fun downloadFlightHistory(): Flow<PagingData<FlightHistory>> {
        return Pager(
            config = PagingConfig(pageSize = 10,enablePlaceholders = true),
            remoteMediator = FlightHistoryRemoteMediator()
        ){
            FlightHistoryApplication.database.getFlightHistoryDao().getFlightHistory()!!
        }.flow
    }

    suspend fun saveFlightHistory(flightHistory: List<FlightHistory>) {
        Log.d("FH", "saveFlightHistory: $flightHistory")
        FlightHistoryApplication.database.getFlightHistoryDao().insertFlightHistoryPagingData(flightHistory)
    }
}