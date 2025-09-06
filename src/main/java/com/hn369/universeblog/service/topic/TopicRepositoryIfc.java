package com.hn369.universeblog.service.topic;

import com.hn369.universeblog.service.entity.topic.Topic;

public interface TopicRepositoryIfc {
	Topic saveTopic(Topic topic);

	Topic findByTopicUuid(String topicUuid);

}
