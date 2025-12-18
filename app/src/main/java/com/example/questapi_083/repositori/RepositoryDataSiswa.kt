package com.example.questapi_083.repositori

import com.example.questapi_083.apiservice.ServiceApiSiswa

import com.example.questapi_083.modeldata.DataSiswa
import retrofit2.Response

interface RepositoryDataSiswa {
    suspend fun getDataSiswa() : List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa):retrofit2.Response<Void>
}

class JaringanRepositoryDataSiswa(
    private val serviceApiSiswa: ServiceApiSiswa
): RepositoryDataSiswa {
    override suspend fun getDataSiswa(): List<DataSiswa> = serviceApiSiswa.getSiswa()
    override suspend fun postDataSiswa(dataSiswa: DataSiswa): Response<Void> = serviceApiSiswa.postSiswa(dataSiswa)
}