package com.hn369.universeblog.service.topic;

import com.hn369.universeblog.dto.topic.TopicReadDto;
import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;

public interface TopicRepositoryIfc {
	TopicWriteResponseDto createTopic(TopicWriteRequestDto topicWriteDto);

	TopicReadDto findByTopicUuid(String topicUuid);

}
