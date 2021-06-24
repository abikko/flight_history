package kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter

import android.view.View
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory

interface FlightHistoryClickHandler {
    fun onFlightHistoryClicked(view: View)
}