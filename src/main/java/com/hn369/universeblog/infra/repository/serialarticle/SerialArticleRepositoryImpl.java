package com.hn369.universeblog.infra.repository.serialarticle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;
import com.hn369.universeblog.service.serialarticle.SerialArticleRepositoryIfc;

@Repository
public class SerialArticleRepositoryImpl implements SerialArticleRepositoryIfc {
	
	@Autowired
	private SerialArticleJpaRespository serialArticleJpaRespository;

	@Override
	public SerialArticle findByUuid(String uuid) {
		SerialArticle serialArticle = serialArticleJpaRespository.findByUuid(uuid);
		return serialArticle;
	}

}
