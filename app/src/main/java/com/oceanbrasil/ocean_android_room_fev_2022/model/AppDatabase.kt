package com.oceanbrasil.ocean_android_room_fev_2022.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ProductEntity::class], version = 1 )
abstract class AppDatabase : RoomDatabase() {

    abstract fun productDao(): ProductDao

    companion object {
        fun getDatabase(context: Context) : AppDatabase {
             return Room.databaseBuilder(
                 context.applicationContext,
                 AppDatabase::class.java,
                 "app_database"
             ).build()
        }
    }
}