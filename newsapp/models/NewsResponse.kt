package nibm.hdse232.newsapp.models

import nibm.hdse232.newsapp.models.Article

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)