package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.RoomUtils

@Entity(tableName = RoomUtils.TIMELINE_TABLE_KEY)
data class Timeline(
    @SerializedName("webcast_liftoff")
    var webcastLiftoff: Int
)