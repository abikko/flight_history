package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Links

class LinksConverter {

    @TypeConverter
    fun fromLinksToString(className: Links): String =
        Gson().toJson(className)

    @TypeConverter
    fun fromStringToLinks(string: String): Links =
        Gson().fromJson(string, Links::class.java)
}