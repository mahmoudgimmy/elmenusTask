package com.example.elmenustask.data.local

import androidx.paging.PagingData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.elmenustask.models.Item
import com.example.elmenustask.models.Tag
import kotlinx.coroutines.flow.Flow

@Dao
interface RecipesDao {

    @Query("SELECT * FROM Tag")
    suspend fun loadAllTags(): List<Tag>

    @Query("SELECT * FROM Item Where tagName = :tagName")
    suspend fun loadItems(tagName:String): List<Item>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTag(tag: Tag)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertItem(item: Item)


}