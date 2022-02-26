package com.example.elmenustask.di

import com.example.elmenustask.data.remote.RecipesRemote

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL: String = "https://elmenus-assignment.getsandbox.com/"

// network module used for providing dependencies for calling apis, di used by koin
val networkModule = module {
    single {
        HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }
    factory { provideOkHttpClient(get()) }
    factory { provideRetrofit(get()) }
    factory { provideRemoteStoreService(get()) }

}

fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder().baseUrl(BASE_URL).client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create()).build()
}

fun provideOkHttpClient(
    httpInterceptor: HttpLoggingInterceptor,
): OkHttpClient {

    return OkHttpClient().newBuilder()
        .addInterceptor(httpInterceptor).build()
}

fun provideRemoteStoreService(retrofit: Retrofit): RecipesRemote =
    retrofit.create(RecipesRemote::class.java)


