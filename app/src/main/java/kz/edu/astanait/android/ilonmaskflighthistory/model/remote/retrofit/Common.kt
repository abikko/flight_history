package kz.edu.astanait.android.ilonmaskflighthistory.model.remote.retrofit

import kz.edu.astanait.android.ilonmaskflighthistory.model.remote.retrofit.service.FlightHistoryService

object Common {
    val flightHistoryService: FlightHistoryService
    get() = RetrofitClient.instance!!.create(FlightHistoryService::class.java)
}