package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FirstStage

class FirstStageConverter {

    @TypeConverter
    fun fromFirstStageToString(firstStage: FirstStage) : String =
        Gson().toJson(firstStage)

    @TypeConverter
    fun fromStringToFirstStage(string: String) : FirstStage =
        Gson().fromJson(string, FirstStage::class.java)
}