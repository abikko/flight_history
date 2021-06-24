package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.LaunchFailureDetails

class LaunchFailureDetailsConverter {

    @TypeConverter
    fun fromLaunchFailureDetailsConverterToString(launchFailureDetails: LaunchFailureDetails?) : String =
        Gson().toJson(launchFailureDetails)

    @TypeConverter
    fun fromStringToLaunchFailureDetails(string: String?) : LaunchFailureDetails? =
        Gson().fromJson(string, LaunchFailureDetails::class.java)
}