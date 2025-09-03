package com.hn369.universeblog.service.topic;

import com.hn369.universeblog.dto.topic.TopicTranslationWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteResponseDto;
import com.hn369.universeblog.service.entity.topic.TopicTranslation;

public interface TopicTranslationRepositoryIfc {
	
	TopicTranslationWriteResponseDto createTopicTranslation(TopicTranslationWriteRequestDto topicTranslationWriteRequestDto);
	
	TopicTranslation findByTopicUuidAndLanguageCode(String topicUuid, String languageCode);

}
