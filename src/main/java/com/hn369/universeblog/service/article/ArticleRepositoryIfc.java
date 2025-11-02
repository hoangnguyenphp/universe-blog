package com.hn369.universeblog.service.article;

import java.util.List;

import com.hn369.universeblog.dto.article.ArticleReadResponseDto;
import com.hn369.universeblog.dto.article.ArticleMasterSearchRequestDto;
import com.hn369.universeblog.dto.article.ArticleMasterSearchResponseDto;
import com.hn369.universeblog.dto.article.RelatedArticleReadResponseDto;
import com.hn369.universeblog.service.entity.article.Article;
import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;

public interface ArticleRepositoryIfc {
	
	Article saveArticle(Article rawArticle);
	
	Article retrieveArticle(String articleUuid);
	
	Article findByArticleUuidAndDefaultLanguageCode(String articleUuid, String languageCode);
	
	ArticleReadResponseDto retrieveArticleByUuidAndLanguage(String articleUuid, String languageCode);
	
	List<ArticleReadResponseDto> getSingleArticlesByTopicAndLanguage(String topicUuid, String languageCode, Integer quantity);
	
	List<ArticleReadResponseDto> retrieveHotArticles(Integer quantity, String languageCode);
	
	Integer countArticleOfASerialArticle(SerialArticle serialArticle);
	
	ArticleReadResponseDto retrieveBySerialArticleAndChapterIdAndLanguage(String serialArticleUuid, Integer chapterId, String languageCode);
	
	List<ArticleReadResponseDto> retrieveAllChaptersOfASerialArticle(String serialArticleUuid, String languageCode, int size, int offset);
	
	List<RelatedArticleReadResponseDto> retrieveRelatedArticles(String articleUuid, String languageCode, int size, int offset);
	List<ArticleMasterSearchResponseDto> searchArticleMaster(ArticleMasterSearchRequestDto articleMasterSearchRequestDto);
}