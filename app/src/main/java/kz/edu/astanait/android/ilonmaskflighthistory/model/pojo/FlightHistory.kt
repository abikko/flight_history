package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.RoomUtils

@Entity(tableName = RoomUtils.FLIGHT_HISTORY_TABLE_KEY)
data class FlightHistory(
    @SerializedName("crew")
    var crew: Any?,
    @SerializedName("details")
    var details: String?,
    @SerializedName("flight_number")
    var flightNumber: Int,
    @SerializedName("is_tentative")
    var isTentative: Boolean,
    @SerializedName("launch_date_local")
    var launchDateLocal: String,
    @SerializedName("launch_date_unix")
    var launchDateUnix: Int,
    @SerializedName("launch_date_utc")
    var launchDateUtc: String,
    @SerializedName("launch_failure_details")
    var launchFailureDetails: LaunchFailureDetails?,
    @SerializedName("launch_site")
    var launchSite: LaunchSite,
    @SerializedName("launch_success")
    var launchSuccess: Boolean,
    @SerializedName("launch_window")
    var launchWindow: Int,
    @SerializedName("launch_year")
    var launchYear: String,
    @SerializedName("links")
    var links: Links,
    @PrimaryKey(autoGenerate = false)
    @SerializedName("mission_id")
    var missionId: List<String>,
    @SerializedName("mission_name")
    var missionName: String,
    @SerializedName("rocket")
    var rocket: Rocket,
    @SerializedName("ships")
    var ships: List<Any>,
    @SerializedName("static_fire_date_unix")
    var staticFireDateUnix: Int,
    @SerializedName("static_fire_date_utc")
    var staticFireDateUtc: String?,
    @SerializedName("tbd")
    var tbd: Boolean,
    @SerializedName("telemetry")
    var telemetry: Telemetry,
    @SerializedName("tentative_max_precision")
    var tentativeMaxPrecision: String,
    @SerializedName("timeline")
    var timeline: Timeline,
    @SerializedName("upcoming")
    var upcoming: Boolean
)