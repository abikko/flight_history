package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Timeline

class TimelineConverter {

    @TypeConverter
    fun fromTimelineToString(className: Timeline?): String =
        Gson().toJson(className)

    @TypeConverter
    fun fromStringToTimeline(string: String): Timeline? =
        Gson().fromJson(string, Timeline::class.java)
}