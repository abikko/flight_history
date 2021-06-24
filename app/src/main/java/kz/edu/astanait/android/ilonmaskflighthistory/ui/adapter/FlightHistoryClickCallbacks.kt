package kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter

import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory

interface FlightHistoryClickCallbacks {
    fun onFlightHistoryClicked(flightHistory: FlightHistory)
}