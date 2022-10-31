package data.model.datasourceimpl

import data.model.APIResponse
import data.model.api.NewsAPIService
import data.model.dataSource.NewsRemoteDataSource
import retrofit2.Response

class NewsRemoteDataSourceImpl(
    private val newsAPIService: NewsAPIService,
    private val country:String,private val page:Int):NewsRemoteDataSource{
    override suspend fun getTopheadlines(

    ): Response<APIResponse> {
return newsAPIService.getTopHeadlines(country, page)
    }
}