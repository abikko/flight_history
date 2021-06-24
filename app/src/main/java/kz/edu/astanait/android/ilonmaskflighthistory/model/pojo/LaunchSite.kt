package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class LaunchSite(
    @SerializedName("site_id")
    var siteId: String,
    @SerializedName("site_name")
    var siteName: String,
    @SerializedName("site_name_long")
    var siteNameLong: String
)