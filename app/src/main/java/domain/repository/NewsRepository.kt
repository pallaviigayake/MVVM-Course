package domain.repository

import data.model.APIResponse
import data.model.Article
import data.model.util.Resource
import kotlinx.coroutines.flow.Flow

interface NewsRepository {
    suspend fun getNewsHeadlines():Resource<APIResponse>
    suspend fun getSearchNews(searchQuery: String):Resource<APIResponse>
    //local database
    suspend fun savedNews(article: Article)
    suspend fun deleteNews(article: Article)
     fun getsavedNews(): Flow<List<Article>>
}