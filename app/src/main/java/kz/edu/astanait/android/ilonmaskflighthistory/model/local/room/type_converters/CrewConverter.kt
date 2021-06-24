package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Crew

class CrewConverter {
    @TypeConverter
    fun fromAnyToString(value: Crew?) : String? =
        if(value == null) null else Gson().toJson(value)

    @TypeConverter
    fun fromStringToAny(value: String) : Crew? =
        Gson().fromJson(value,Crew::class.java)
}