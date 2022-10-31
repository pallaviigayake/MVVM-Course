package domain.usecase

import data.model.Article
import domain.repository.NewsRepository

class DeleteSavedNewsUsecase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.deleteNews(article)
}