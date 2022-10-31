package domain.usecase

import data.model.APIResponse
import data.model.Article
import domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class GetSavedNewsUseCase(private val newsRepository: NewsRepository) {
     fun execute(): Flow<List<Article>>{
         return newsRepository.getsavedNews()
     }
}