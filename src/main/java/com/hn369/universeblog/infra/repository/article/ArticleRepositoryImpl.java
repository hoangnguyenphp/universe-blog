package com.hn369.universeblog.infra.repository.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.dto.article.ArticleReadResponseDto;
import com.hn369.universeblog.infra.repository.serialarticle.SerialArticleJpaRespository;
import com.hn369.universeblog.service.article.ArticleRepositoryIfc;
import com.hn369.universeblog.service.entity.article.Article;
import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;

@Repository
public class ArticleRepositoryImpl implements ArticleRepositoryIfc {
	
	@Autowired
	private ArticleJpaRepository articleJpaRepository;
	
	@Autowired
	private ArticleMyBatisMapper articleMyBatisMapper;
	
	@Autowired
	private ArticleTranslationJpaRepository articleTranslationJpaRepository;
	
	@Autowired
	private SerialArticleJpaRespository serialArticleJpaRespository;

	@Override
	public Article createArticle(Article rawArticle) {
		Article newArticle = articleJpaRepository.save(rawArticle);
		return newArticle;
	}
	
	@Override
	public Article retrieveArticle(String articleUuid) {
		Article article = articleJpaRepository.findByArticleUuid(articleUuid);
		return article;
	}
	
	@Override
	public ArticleReadResponseDto retrieveArticleByUuidAndLanguage(String articleUuid, String languageCode) {
		ArticleReadResponseDto articleReadResponseDto = articleMyBatisMapper.retrieveArticleByUuidAndLanguage(articleUuid, languageCode);
		return articleReadResponseDto;
	}
	

	@Override
	public List<ArticleReadResponseDto> getSingleArticlesByTopicAndLanguage(String topicUuid, String languageCode) {
		List<ArticleReadResponseDto> articleList = articleMyBatisMapper.findSingleArticlesByTopicAndLanguage(topicUuid, languageCode);
		return articleList;
	}
	
	@Override
	public List<ArticleReadResponseDto> retrieveHotArticles(Integer quantity, String languageCode) {
		List<ArticleReadResponseDto> hotArticles = articleMyBatisMapper.retrieveHotArticles(quantity, languageCode);
		return hotArticles;
	}

	@Override
	public Integer countArticleOfASerialArticle(SerialArticle serialArticle) {
		Integer count = articleJpaRepository.countBySerialArticle(serialArticle);
		return count;
	}

	@Override
	public ArticleReadResponseDto retrieveBySerialArticleAndChapterIdAndLanguage(String serialArticleUuid, Integer chapterId, String languageCode) {
		ArticleReadResponseDto articleReadResponseDto = articleMyBatisMapper.findBySerialArticleAndChapterIdAndLanguage(serialArticleUuid, chapterId, languageCode);
		return articleReadResponseDto;
	}
	
	
	
}
