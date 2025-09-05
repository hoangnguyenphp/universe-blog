package com.hn369.universeblog.infra.repository.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.article.ArticleTranslationRepositoryIfc;
import com.hn369.universeblog.service.entity.article.ArticleTranslation;

@Repository
public class ArticleTranslationRepositoryImpl implements ArticleTranslationRepositoryIfc {
	
	@Autowired
	ArticleTranslationJpaRepository articleTranslationJpaRepository;

	@Override
	public ArticleTranslation saveArticleTranslation(ArticleTranslation rawArticleTranslation) {
		ArticleTranslation articleTranslation = articleTranslationJpaRepository.save(rawArticleTranslation);
		return articleTranslation;
	}

}
