package com.hn369.universeblog.infra.repository.articletopic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.articletopic.ArticleTopicRepositoryIfc;
import com.hn369.universeblog.service.entity.articletopic.ArticleTopic;

@Repository
public class ArticleTopicRepositoryImpl implements ArticleTopicRepositoryIfc {
	
	@Autowired
	private ArticleTopicJpaRepository articleTopicJpaRepository;

	@Override
	public ArticleTopic saveArticleTopic(ArticleTopic rawArticleTopic) {
		ArticleTopic newArticleTopic = articleTopicJpaRepository.save(rawArticleTopic);
		return newArticleTopic;
	}

}
