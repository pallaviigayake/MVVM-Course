package domain.usecase

import data.model.APIResponse
import data.model.util.Resource
import domain.repository.NewsRepository
import retrofit2.Response

class GetNewsHeadlinesUsecase(private val newsRepository: NewsRepository) {
    suspend fun execute():Resource<APIResponse>{
        return newsRepository.getNewsHeadlines()
    }
}