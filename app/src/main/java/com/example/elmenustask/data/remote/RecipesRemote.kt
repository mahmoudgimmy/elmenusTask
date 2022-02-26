package com.example.elmenustask.data.remote

import com.example.elmenustask.models.Items
import com.example.elmenustask.models.Tags
import retrofit2.http.GET
import retrofit2.http.Path

interface RecipesRemote {
    @GET("tags/{page}")
    suspend fun getTags(@Path("page") pageNumber: Int): Tags

    @GET("items/{tagName}")
    suspend fun getItemsPerTag(@Path("tagName") tagName: String): Items

}