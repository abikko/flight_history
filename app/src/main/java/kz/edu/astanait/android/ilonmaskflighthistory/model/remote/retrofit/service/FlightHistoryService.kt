package kz.edu.astanait.android.ilonmaskflighthistory.model.remote.retrofit.service

import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query


interface FlightHistoryService {
    //https://api.spacexdata.com/v3/launches?limit=10&offset=0
    @GET("v3/launches")
    suspend fun getFlightHistory(
        @Query("limit") limit: Int = 10,
        @Query("offset") offset: Int
    ): Response<List<FlightHistory>>
}