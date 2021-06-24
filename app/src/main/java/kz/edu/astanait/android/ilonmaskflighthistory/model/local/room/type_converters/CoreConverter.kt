package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core

class CoreConverter {
    @TypeConverter
    fun fromCoreToString(core: Core) : String =
        Gson().toJson(core)

    @TypeConverter
    fun fromStringToCore(string: String) : Core =
        Gson().fromJson(string, Core::class.java)
}