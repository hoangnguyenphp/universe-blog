package com.hn369.universeblog.infra.repository.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.topic.TopicTranslation;
import com.hn369.universeblog.service.entity.topic.TopicTranslationId;
import com.hn369.universeblog.service.topic.TopicTranslationRepositoryIfc;

@Repository
public class TopicTranslationRepositoryImpl implements TopicTranslationRepositoryIfc {

	@Autowired
	private TopicTranslationJpaRepository topicTranslationJpaRepository;

	@Override
	public TopicTranslation saveTopicTranslation(TopicTranslation topicTranslation) {
		TopicTranslation newTopicTranslation = topicTranslationJpaRepository.save(topicTranslation);
		return newTopicTranslation;
	}
	
	@Override
	public TopicTranslation findByTopicUuidAndLanguageCode(String topicUuid, String languageCode) {
		TopicTranslation topicTranslation = topicTranslationJpaRepository.findById(new TopicTranslationId(topicUuid, languageCode)).orElse(null);
		return topicTranslation;
	}


	@Override
	public List<TopicTranslation> findByLanguageCode(String languageCode) {
		List<TopicTranslation> topicTranslationList = topicTranslationJpaRepository.findByLanguageCode(languageCode);
		return topicTranslationList;
	}

}
