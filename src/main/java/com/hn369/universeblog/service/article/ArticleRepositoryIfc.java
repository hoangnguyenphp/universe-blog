package com.hn369.universeblog.service.article;

import com.hn369.universeblog.service.entity.article.Article;

public interface ArticleRepositoryIfc {
	
	Article createArticle(Article rawArticle);
	
	Article retrieveArticle(String articleUuid);
}