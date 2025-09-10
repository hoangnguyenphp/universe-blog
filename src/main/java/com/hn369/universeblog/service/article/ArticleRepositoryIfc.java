package com.hn369.universeblog.service.article;

import java.util.List;

import com.hn369.universeblog.dto.article.ArticleReadResponseDto;
import com.hn369.universeblog.service.entity.article.Article;

public interface ArticleRepositoryIfc {
	
	Article createArticle(Article rawArticle);
	
	Article retrieveArticle(String articleUuid);
	
	List<ArticleReadResponseDto> getSingleArticlesByTopicAndLanguage(String topicUuid, String languageCode);
}