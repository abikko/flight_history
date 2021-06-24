package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class Fairings(
    @SerializedName("recovered")
    var recovered: Boolean,
    @SerializedName("recovery_attempt")
    var recoveryAttempt: Boolean,
    @SerializedName("reused")
    var reused: Boolean,
    @SerializedName("ship")
    var ship: Any
)