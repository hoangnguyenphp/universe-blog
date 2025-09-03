package com.hn369.universeblog.service.topic;

import com.hn369.universeblog.dto.topic.TopicTranslationWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteResponseDto;

public interface TopicTranslationRepositoryIfc {
	
	public TopicTranslationWriteResponseDto createTopicTranslation(TopicTranslationWriteRequestDto topicTranslationWriteRequestDto);

}
