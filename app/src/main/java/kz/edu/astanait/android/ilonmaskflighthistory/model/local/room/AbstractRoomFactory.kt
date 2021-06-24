package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.dao.FlightHistoryDao
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.dao.RemoteKeysDao
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.type_converters.*
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.FlightHistory
import kz.edu.astanait.android.ilonmaskflighthistory.model.pojo.RemoteKeys

@Database(entities = [FlightHistory::class, RemoteKeys::class], exportSchema = false, version = 7)
@TypeConverters(
    CrewConverter::class,
    CoreConverter::class, CrewConverter::class, FairingsConverter::class,
    FirstStageConverter::class, LaunchFailureDetailsConverter::class,
    LaunchSiteConverter::class, OrbitParamsConverter::class,
    PayloadConverter::class, SecondStageConverter::class,
    TelemetryConverter::class, LinksConverter::class, RocketConverter::class,
    TimelineConverter::class, ListConverter::class
)
abstract class AbstractRoomFactory : RoomDatabase() {
    abstract fun getFlightHistoryDao(): FlightHistoryDao

    abstract fun getRemoteKeysDao() : RemoteKeysDao


}