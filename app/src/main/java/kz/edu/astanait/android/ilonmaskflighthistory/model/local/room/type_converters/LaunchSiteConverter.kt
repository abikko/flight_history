package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.LaunchSite

class LaunchSiteConverter {

    @TypeConverter
    fun fromLaunchSiteToString(launchSite: LaunchSite) : String =
        Gson().toJson(launchSite)

    @TypeConverter
    fun fromStringToLaunchSite(string: String) : LaunchSite =
        Gson().fromJson(string, LaunchSite::class.java)
}