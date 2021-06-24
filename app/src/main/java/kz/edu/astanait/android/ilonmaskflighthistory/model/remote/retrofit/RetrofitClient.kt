package kz.edu.astanait.android.ilonmaskflighthistory.model.remote.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {

    const val BASE_URL = "https://api.spacexdata.com/"

    var instance: Retrofit? = null
        get() {
            if (field == null) {
                instance = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return field
        }
}