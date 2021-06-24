package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class OrbitParams(
    @SerializedName("apoapsis_km")
    var apoapsisKm: Double,
    @SerializedName("arg_of_pericenter")
    var argOfPericenter: Any,
    @SerializedName("eccentricity")
    var eccentricity: Any,
    @SerializedName("epoch")
    var epoch: Any,
    @SerializedName("inclination_deg")
    var inclinationDeg: Double,
    @SerializedName("lifespan_years")
    var lifespanYears: Any,
    @SerializedName("longitude")
    var longitude: Any,
    @SerializedName("mean_anomaly")
    var meanAnomaly: Any,
    @SerializedName("mean_motion")
    var meanMotion: Any,
    @SerializedName("periapsis_km")
    var periapsisKm: Double,
    @SerializedName("period_min")
    var periodMin: Any,
    @SerializedName("raan")
    var raan: Any,
    @SerializedName("reference_system")
    var referenceSystem: String,
    @SerializedName("regime")
    var regime: String,
    @SerializedName("semi_major_axis_km")
    var semiMajorAxisKm: Any
)