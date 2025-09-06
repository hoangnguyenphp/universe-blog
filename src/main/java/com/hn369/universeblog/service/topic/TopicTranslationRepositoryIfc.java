package com.hn369.universeblog.service.topic;

import java.util.List;

import com.hn369.universeblog.service.entity.topic.TopicTranslation;

public interface TopicTranslationRepositoryIfc {
	
	TopicTranslation saveTopicTranslation(TopicTranslation topicTranslation);
	
	TopicTranslation findByTopicUuidAndLanguageCode(String topicUuid, String languageCode);
	
	List<TopicTranslation> findByLanguageCode(String languageCode);

}
