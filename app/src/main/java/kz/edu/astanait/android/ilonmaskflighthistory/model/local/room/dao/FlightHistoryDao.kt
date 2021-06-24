package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.dao

import androidx.paging.PagingSource
import androidx.room.*
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.RoomUtils
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory

@Dao
interface FlightHistoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFlightHistoryPagingData(flightHistoryPagingData: List<FlightHistory>?)

    @Query("SELECT * FROM `${RoomUtils.FLIGHT_HISTORY_TABLE_KEY}`")
    fun getFlightHistory(): PagingSource<Int, FlightHistory>?


    @Update
    suspend fun updateFlightHistoryPagingData(flightHistoryPagingData: List<FlightHistory>?)


    @Query("DELETE FROM `${RoomUtils.FLIGHT_HISTORY_TABLE_KEY}`")
    suspend fun clearFlightHistory()
}