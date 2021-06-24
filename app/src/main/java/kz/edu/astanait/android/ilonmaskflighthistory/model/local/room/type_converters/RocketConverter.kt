package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Rocket

class RocketConverter {

    @TypeConverter
    fun fromRocketToString(className: Rocket): String =
        Gson().toJson(className)

    @TypeConverter
    fun fromStringToRocket(string: String): Rocket =
        Gson().fromJson(string, Rocket::class.java)
}