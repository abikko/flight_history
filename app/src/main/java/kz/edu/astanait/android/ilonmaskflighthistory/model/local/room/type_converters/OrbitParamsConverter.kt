package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.OrbitParams

class OrbitParamsConverter {

    @TypeConverter
    fun fromOrbitParamsToString(orbitParams: OrbitParams) : String =
        Gson().toJson(orbitParams)

    @TypeConverter
    fun fromStringToOrbitParams(string: String) : OrbitParams =
        Gson().fromJson(string, OrbitParams::class.java)

}