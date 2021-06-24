package kz.edu.astanait.android.ilonmaskflighthistory.application

import android.app.Application
import androidx.room.Room
import kz.edu.astanait.android.ilonmaskflighthistory.model.local.room.AbstractRoomFactory

class FlightHistoryApplication : Application() {


    companion object {
        lateinit var database: AbstractRoomFactory
    }

    override fun onCreate() {
        super.onCreate()
        database =
            Room
                .databaseBuilder(applicationContext, AbstractRoomFactory::class.java, "Database")
                .fallbackToDestructiveMigration()
                .build()
    }
}