package data.model.dataSource

import data.model.APIResponse
import retrofit2.Response

interface NewsRemoteDataSource {
    suspend fun getTopheadlines():Response<APIResponse>
}