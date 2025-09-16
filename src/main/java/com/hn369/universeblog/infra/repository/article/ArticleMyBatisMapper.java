package com.hn369.universeblog.infra.repository.article;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hn369.universeblog.dto.article.ArticleReadResponseDto;

@Mapper
public interface ArticleMyBatisMapper {
	List<ArticleReadResponseDto> findSingleArticlesByTopicAndLanguage(String topicUuid, String languageCode, Integer quantity);
	List<ArticleReadResponseDto> retrieveHotArticles(Integer quantity, String languageCode);
	ArticleReadResponseDto retrieveArticleByUuidAndLanguage(String articleUuid, String languageCode);
	ArticleReadResponseDto findBySerialArticleAndChapterIdAndLanguage(String serialArticleUuid, Integer chapterId, String languageCode);
	List<ArticleReadResponseDto> retrieveAllChaptersOfASerialArticle(String serialArticleUuid, String languageCode, int size, int offset);
}
