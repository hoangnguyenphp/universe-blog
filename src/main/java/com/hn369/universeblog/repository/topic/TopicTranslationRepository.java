package com.hn369.universeblog.repository.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.entity.topic.TopicTranslation;
import com.hn369.universeblog.entity.topic.TopicTranslationId;

@Repository
public interface TopicTranslationRepository extends CrudRepository<TopicTranslation, TopicTranslationId>{

}
