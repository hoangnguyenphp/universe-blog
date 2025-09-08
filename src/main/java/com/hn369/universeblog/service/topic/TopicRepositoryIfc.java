package com.hn369.universeblog.service.topic;

import java.util.List;

import com.hn369.universeblog.dto.topic.TopicByLanguageReadResponseDto;
import com.hn369.universeblog.service.entity.topic.Topic;

public interface TopicRepositoryIfc {
	Topic saveTopic(Topic topic);

	Topic findByTopicUuid(String topicUuid);
	
	List<TopicByLanguageReadResponseDto> retrieveTopicsByLanguageCode(String languageCode);

}
