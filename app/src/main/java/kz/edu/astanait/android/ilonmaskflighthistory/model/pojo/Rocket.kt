package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import androidx.room.ColumnInfo
import androidx.room.Entity
import com.google.gson.annotations.SerializedName
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.RoomUtils

@Entity(tableName = RoomUtils.ROCKET_TABLE_KEY)
data class Rocket(
    @SerializedName("fairings")
    var fairings: Fairings,
    @SerializedName("first_stage")
    var firstStage: FirstStage,
    @SerializedName("rocket_id")
    var rocketId: String,
    @SerializedName("rocket_name")
    var rocketName: String,
    @SerializedName("rocket_type")
    var rocketType: String,
    @SerializedName("second_stage")
    var secondStage: SecondStage
)