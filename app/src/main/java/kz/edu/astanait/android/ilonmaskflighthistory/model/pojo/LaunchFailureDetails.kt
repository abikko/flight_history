package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Room
import com.google.gson.annotations.SerializedName
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.RoomUtils

@Entity(tableName = RoomUtils.LAUNCH_FAILURE_DETAILS_TABLE_KEY)
data class LaunchFailureDetails(
    @ColumnInfo(name = RoomUtils.LAUNCH_FAILURE_COLUMN_ALTITUDE)
    @SerializedName("altitude")
    var altitude: Any,
    @ColumnInfo(name = RoomUtils.LAUNCH_FAILURE_COLUMN_REASON)
    @SerializedName("reason")
    var reason: String,
    @ColumnInfo(name = RoomUtils.LAUNCH_FAILURE_COLUMN_TIME)
    @SerializedName("time")
    var time: Int
)