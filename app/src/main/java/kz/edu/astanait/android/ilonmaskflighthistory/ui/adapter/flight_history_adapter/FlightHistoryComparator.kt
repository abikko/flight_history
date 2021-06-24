package kz.edu.astanait.android.ilonmaskflighthistory.ui.adapter.flight_history_adapter

import androidx.recyclerview.widget.DiffUtil
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory

object FlightHistoryComparator : DiffUtil.ItemCallback<FlightHistory>() {
    override fun areItemsTheSame(oldItem: FlightHistory, newItem: FlightHistory): Boolean =
        oldItem == newItem

    override fun areContentsTheSame(oldItem: FlightHistory, newItem: FlightHistory): Boolean =
        oldItem.missionId == newItem.missionId

}