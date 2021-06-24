package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Core
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.Telemetry

class TelemetryConverter {

    @TypeConverter
    fun fromTelemetryToString(telemetry: Telemetry) : String =
        Gson().toJson(telemetry)

    @TypeConverter
    fun fromStringToCore(string: String) : Telemetry =
        Gson().fromJson(string, Telemetry::class.java)

}