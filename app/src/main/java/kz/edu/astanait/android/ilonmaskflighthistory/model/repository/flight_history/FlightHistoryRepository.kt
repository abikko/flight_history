package kz.edu.astanait.android.ilonmaskflighthistory.model.repository.flight_history

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import retrofit2.Response

interface FlightHistoryRepository {
    fun downloadFlightHistory() : Flow<PagingData<FlightHistory>>
}