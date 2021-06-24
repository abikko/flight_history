package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.RoomUtils

@Entity(tableName = RoomUtils.TELEMETRY_TABLE_KEY)
data class Telemetry(
    @SerializedName("flight_club")
    var flightClub: Any
)