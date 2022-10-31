package domain.usecase

import android.app.DownloadManager
import data.model.APIResponse
import data.model.util.Resource
import domain.repository.NewsRepository

class GetSearchNewsUsecase(private val newsRepository: NewsRepository) {
    suspend fun execute(searchQuery: String):Resource<APIResponse>{
        return newsRepository.getSearchNews(searchQuery)
    }
}