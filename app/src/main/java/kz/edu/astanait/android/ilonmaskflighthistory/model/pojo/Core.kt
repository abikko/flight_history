package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class Core(
    @SerializedName("block")
    var block: Any,
    @SerializedName("core_serial")
    var coreSerial: String,
    @SerializedName("flight")
    var flight: Int,
    @SerializedName("gridfins")
    var gridfins: Boolean,
    @SerializedName("land_success")
    var landSuccess: Any,
    @SerializedName("landing_intent")
    var landingIntent: Boolean,
    @SerializedName("landing_type")
    var landingType: Any,
    @SerializedName("landing_vehicle")
    var landingVehicle: Any,
    @SerializedName("legs")
    var legs: Boolean,
    @SerializedName("reused")
    var reused: Boolean
)