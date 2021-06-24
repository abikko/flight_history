package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Fairings

class FairingsConverter {

    @TypeConverter
    fun fromFairingsToString(fairings: Fairings) : String =
        Gson().toJson(fairings)

    @TypeConverter
    fun fromStringToFairings(string: String) : Fairings =
        Gson().fromJson(string, Fairings::class.java)
}