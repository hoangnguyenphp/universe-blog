package com.hn369.universeblog.infra.repository.serialarticle;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;

@Repository
public interface SerialArticleJpaRespository extends CrudRepository<SerialArticle, Long>{
	
	SerialArticle findByUuid(String uuid);

}
