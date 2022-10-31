package data.model.api
import data.model.APIResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsAPIService {
    @GET("/v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("country")
        country:String,
        @Query("page")
        page:Int,
        @Query("apiKey")
        apiKey:String="09705fc774c547df8d79509e0ce56456"
    ):Response<APIResponse>
}