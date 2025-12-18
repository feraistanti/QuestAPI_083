package com.example.questapi_083.apiservice

import com.example.questapi_083.modeldata.DataSiswa
import com.example.questapi_083.repositori.RepositoryDataSiswa
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ServiceApiSiswa {
    @GET("bacaTeman.php")
    suspend fun getSiswa(): List<DataSiswa>

    @POST("insertTM.php")
    suspend fun postSiswa(@Body dataSiswa: DataSiswa): retrofit2.Response<Void>

}
