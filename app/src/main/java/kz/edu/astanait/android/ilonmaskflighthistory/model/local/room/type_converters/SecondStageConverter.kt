package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.SecondStage

class SecondStageConverter {

    @TypeConverter
    fun fromSecondStageToString(secondStage: SecondStage) : String =
        Gson().toJson(secondStage)

    @TypeConverter
    fun fromStringToCore(string: String) : SecondStage =
        Gson().fromJson(string, SecondStage::class.java)
}