package com.hn369.universeblog.infra.repository.article;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hn369.universeblog.dto.article.ArticleReadResponseDto;

@Mapper
public interface ArticleMyBatisMapper {
	List<ArticleReadResponseDto> findSingleArticlesByTopicAndLanguage(String topicUuid, String languageCode);
}
