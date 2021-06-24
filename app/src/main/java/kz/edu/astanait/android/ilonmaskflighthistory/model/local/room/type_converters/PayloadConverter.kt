package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Payload

class PayloadConverter {

    @TypeConverter
    fun fromPayloadToString(className: Payload): String =
        Gson().toJson(className)

    @TypeConverter
    fun fromStringToPayload(string: String): Payload =
        Gson().fromJson(string, Payload::class.java)
}