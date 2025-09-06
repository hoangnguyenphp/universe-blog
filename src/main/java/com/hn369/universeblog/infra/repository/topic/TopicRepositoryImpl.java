package com.hn369.universeblog.infra.repository.topic;

import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.topic.Topic;
import com.hn369.universeblog.service.topic.TopicRepositoryIfc;

@Repository
public class TopicRepositoryImpl implements TopicRepositoryIfc {
	private final TopicJpaRepository topicJpaRepository;

	public TopicRepositoryImpl(TopicJpaRepository topicRepository,
			TopicTranslationJpaRepository topicTranslationRepository) {
		this.topicJpaRepository = topicRepository;
	}

	@Override
	public Topic saveTopic(Topic topic) {
		Topic newTopic = topicJpaRepository.save(topic);
		return newTopic;
	}

	@Override
	public Topic findByTopicUuid(String topicUuid) {
		Topic topic = topicJpaRepository.findByTopicUuid(topicUuid);
		return topic;
	}

}
