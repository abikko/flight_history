package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ListConverter {
    @TypeConverter
    fun fromAnyListToStringList(arrList: List<Any>?) : String =
        Gson().toJson(arrList)

    @TypeConverter
    fun fromStringToAnyList(string: String?) : List<Any> =
        Gson().fromJson<List<Any>>(string)

    @TypeConverter
    fun fromIntegerListToStringList(arrList: List<Int>?) : String =
        Gson().toJson(arrList)

    @TypeConverter
    fun fromStringToIntegerList(string: String?) : List<Int> =
        Gson().fromJson<List<Int>>(string)

    inline fun <reified T> Gson.fromJson(json: String?) = fromJson<T>(json, object: TypeToken<T>() {}.type)

    @TypeConverter
    fun fromAnyToString(any: Any?) : String? =
        Gson().toJson(any)

    @TypeConverter
    fun fromStringToAny(anyString: String?) : Any? =
        Gson().fromJson(anyString,Any::class.java)


    @TypeConverter
    fun fromStringListToStringList(arrList: List<String>) : String =
        Gson().toJson(arrList)

    @TypeConverter
    fun fromStringToStringList(string: String) : List<String> =
        Gson().fromJson<List<String>>(string)

}