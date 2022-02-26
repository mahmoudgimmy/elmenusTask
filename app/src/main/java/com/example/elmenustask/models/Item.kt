package com.example.elmenustask.models

import android.os.Parcelable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class Item(
    @PrimaryKey(autoGenerate = true) val key: Int = 0,
    val id: Int,
    @ColumnInfo(name = "tagName") var tagName: String,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "photoUrl") val photoUrl: String,
    @ColumnInfo(name = "description") val description: String
) :
    Parcelable

data class Items(val items: List<Item>)