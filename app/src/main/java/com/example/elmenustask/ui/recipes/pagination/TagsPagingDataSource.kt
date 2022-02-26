package com.example.elmenustask.ui.recipes.pagination

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.elmenustask.data.local.RecipesDao
import com.example.elmenustask.data.remote.RecipesRemote
import com.example.elmenustask.models.Tag

import retrofit2.HttpException
import java.io.IOException

class TagsPagingSource(
    private val recipesRemote: RecipesRemote,
    private val recipesDao: RecipesDao
    ) : PagingSource<Int, Tag>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Tag> {
        val pageNumber = params.key ?: 1


        return try {
            val response = recipesRemote.getTags(pageNumber)
            response.tags.forEach {
                recipesDao.insertTag(it)
            }
            LoadResult.Page(
                data = response.tags,
                prevKey = if (pageNumber == 1) null else pageNumber - 1,
                nextKey = if (response.tags.isEmpty()) null else pageNumber + 1
            )
        } catch (exception: IOException) {
            LoadResult.Error(exception)
        } catch (exception: HttpException) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Tag>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            state.closestPageToPosition(anchorPosition)?.prevKey
        }
    }
}