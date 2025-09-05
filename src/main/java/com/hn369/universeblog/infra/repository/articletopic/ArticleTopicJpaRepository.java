package com.hn369.universeblog.infra.repository.articletopic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.articletopic.ArticleTopic;
import com.hn369.universeblog.service.entity.articletopic.ArticleTopicId;

@Repository
public interface ArticleTopicJpaRepository extends CrudRepository<ArticleTopic, ArticleTopicId>{

}
