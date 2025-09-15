package com.hn369.universeblog.infra.repository.article;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.article.Article;
import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;

@Repository
public interface ArticleJpaRepository extends CrudRepository<Article, Long>{
	Article findByArticleUuid(String articleUuid);
	
	Integer countBySerialArticle(SerialArticle serialArticle);
}
