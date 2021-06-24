package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class Payload(
    @SerializedName("customers")
    var customers: List<String>,
    @SerializedName("manufacturer")
    var manufacturer: String,
    @SerializedName("nationality")
    var nationality: String,
    @SerializedName("norad_id")
    var noradId: List<Any>,
    @SerializedName("orbit")
    var orbit: String,
    @SerializedName("orbit_params")
    var orbitParams: OrbitParams,
    @SerializedName("payload_id")
    var payloadId: String,
    @SerializedName("payload_mass_kg")
    var payloadMassKg: Double,
    @SerializedName("payload_mass_lbs")
    var payloadMassLbs: Double,
    @SerializedName("payload_type")
    var payloadType: String,
    @SerializedName("reused")
    var reused: Boolean
)