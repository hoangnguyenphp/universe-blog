package com.hn369.universeblog.infra.repository.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.article.ArticleRepositoryIfc;
import com.hn369.universeblog.service.entity.article.Article;

@Repository
public class ArticleRepositoryImpl implements ArticleRepositoryIfc {
	
	@Autowired
	private ArticleJpaRepository articleJpaRepository;

	@Override
	public Article createArticle(Article rawArticle) {
		Article newArticle = articleJpaRepository.save(rawArticle);
		return newArticle;
	}
	
	public Article retrieveArticle(String articleUuid) {
		Article article = articleJpaRepository.findByArticleUuid(articleUuid);
		return article;
	}
	
	

}
