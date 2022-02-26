package com.example.elmenustask.data.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Tag

@Database(entities = [Tag::class, Item::class], version = 1, exportSchema = false)
abstract class RecipesDataBase : RoomDatabase() {

    abstract fun RecipesDao(): RecipesDao

    companion object {
        @Volatile
        private var INSTANCE: RecipesDataBase? = null

        fun getDatabase(context: Context): RecipesDataBase {

            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    RecipesDataBase::class.java,
                    "recipes_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}