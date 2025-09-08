package com.hn369.universeblog.infra.repository.topic;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hn369.universeblog.dto.topic.TopicByLanguageReadResponseDto;
import com.hn369.universeblog.infra.repository.mybatis.topic.TopicMyBatisMapper;
import com.hn369.universeblog.service.entity.topic.Topic;
import com.hn369.universeblog.service.topic.TopicRepositoryIfc;

@Repository
public class TopicRepositoryImpl implements TopicRepositoryIfc {
	private final TopicJpaRepository topicJpaRepository;
	private final TopicMyBatisMapper topicMyBatisMapper;

	public TopicRepositoryImpl(TopicJpaRepository topicRepository,
			TopicTranslationJpaRepository topicTranslationRepository, TopicMyBatisMapper topicMyBatisMapper) {
		this.topicJpaRepository = topicRepository;
		this.topicMyBatisMapper = topicMyBatisMapper;
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

	@Override
	public List<TopicByLanguageReadResponseDto> retrieveTopicsByLanguageCode(String languageCode) {
		List<TopicByLanguageReadResponseDto> topicByLanguageDto = topicMyBatisMapper.findAllTopicsByLanguageCode(languageCode);
		return topicByLanguageDto;
	}

}
