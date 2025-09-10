package com.hn369.universeblog.infra.repository.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.dto.article.ArticleReadResponseDto;
import com.hn369.universeblog.service.article.ArticleRepositoryIfc;
import com.hn369.universeblog.service.entity.article.Article;

@Repository
public class ArticleRepositoryImpl implements ArticleRepositoryIfc {
	
	@Autowired
	private ArticleJpaRepository articleJpaRepository;
	
	@Autowired
	private ArticleMyBatisMapper articleMyBatisMapper;

	@Override
	public Article createArticle(Article rawArticle) {
		Article newArticle = articleJpaRepository.save(rawArticle);
		return newArticle;
	}
	
	public Article retrieveArticle(String articleUuid) {
		Article article = articleJpaRepository.findByArticleUuid(articleUuid);
		return article;
	}

	@Override
	public List<ArticleReadResponseDto> getSingleArticlesByTopicAndLanguage(String topicUuid, String languageCode) {
		List<ArticleReadResponseDto> articleList = articleMyBatisMapper.findSingleArticlesByTopicAndLanguage(topicUuid, languageCode);
		return articleList;
	}
	
	

}
