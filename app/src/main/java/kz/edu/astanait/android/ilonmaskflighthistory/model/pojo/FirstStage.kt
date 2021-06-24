package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class FirstStage(
    @SerializedName("cores")
    var cores: List<Core>
)