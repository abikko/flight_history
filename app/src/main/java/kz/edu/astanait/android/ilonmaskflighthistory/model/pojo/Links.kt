package kz.edu.astanait.android.ilonmaskflighthistory.model.pojo


import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("article_link")
    var articleLink: String,
    @SerializedName("flickr_images")
    var flickrImages: List<Any>,
    @SerializedName("mission_patch")
    var missionPatch: String,
    @SerializedName("mission_patch_small")
    var missionPatchSmall: String,
    @SerializedName("presskit")
    var presskit: Any,
    @SerializedName("reddit_campaign")
    var redditCampaign: Any,
    @SerializedName("reddit_launch")
    var redditLaunch: Any,
    @SerializedName("reddit_media")
    var redditMedia: Any,
    @SerializedName("reddit_recovery")
    var redditRecovery: Any,
    @SerializedName("video_link")
    var videoLink: String,
    @SerializedName("wikipedia")
    var wikipedia: String,
    @SerializedName("youtube_id")
    var youtubeId: String
)