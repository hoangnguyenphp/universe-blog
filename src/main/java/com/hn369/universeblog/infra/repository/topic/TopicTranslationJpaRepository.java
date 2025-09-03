package com.hn369.universeblog.infra.repository.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.topic.TopicTranslation;
import com.hn369.universeblog.service.entity.topic.TopicTranslationId;

@Repository
public interface TopicTranslationJpaRepository extends CrudRepository<TopicTranslation, TopicTranslationId> {

}
