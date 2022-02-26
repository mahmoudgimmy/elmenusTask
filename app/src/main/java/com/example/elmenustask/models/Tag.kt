package com.example.elmenustask.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Tag(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "tagName") val tagName: String,
    @ColumnInfo(name = "photoURL") val photoURL: String
)

data class Tags(val tags: List<Tag>)