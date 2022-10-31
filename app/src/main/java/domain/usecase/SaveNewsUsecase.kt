package domain.usecase

import data.model.Article
import domain.repository.NewsRepository

class SaveNewsUsecase(private val newsRepository: NewsRepository) {
    suspend fun execute(article: Article)=newsRepository.savedNews(article)
}