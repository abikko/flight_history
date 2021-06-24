package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class SecondStage(
    @SerializedName("block")
    var block: Int,
    @SerializedName("payloads")
    var payloads: List<Payload>
)