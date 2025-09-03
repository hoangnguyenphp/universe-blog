package com.hn369.universeblog.infra.repository.topic;

import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.hn369.universeblog.dto.topic.TopicReadDto;
import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;
import com.hn369.universeblog.infra.repository.language.LanguageJpaRepository;
import com.hn369.universeblog.service.entity.language.Language;
import com.hn369.universeblog.service.entity.topic.Topic;
import com.hn369.universeblog.service.entity.topic.TopicTranslation;
import com.hn369.universeblog.service.entity.topic.TopicTranslationId;
import com.hn369.universeblog.service.topic.TopicRepositoryIfc;

import jakarta.transaction.Transactional;

@Repository
public class TopicRepositoryImpl implements TopicRepositoryIfc {
	private final TopicJpaRepository topicRepository;
	
	private final LanguageJpaRepository languageRepository;
	
	private final TopicTranslationJpaRepository topicTranslationRepository;
	
	public TopicRepositoryImpl(LanguageJpaRepository languageRepository, TopicJpaRepository topicRepository, TopicTranslationJpaRepository topicTranslationRepository) {
		this.languageRepository = languageRepository;
		this.topicRepository = topicRepository;
		this.topicTranslationRepository = topicTranslationRepository;
	}
	
	@Transactional
	@Override
	public TopicWriteResponseDto createTopic(TopicWriteRequestDto topicWriteDto) {

		Language defaultLanguage = languageRepository.findByCode(topicWriteDto.getDefaultLanguage());

		Topic topic = new Topic();

		topic.setTopicUuid(UUID.randomUUID().toString());
		topic.setTopicName(topicWriteDto.getTopicName());
		topic.setDefaultLanguage(defaultLanguage);

		topic = topicRepository.save(topic);

		TopicTranslation topicTranslation = new TopicTranslation();

		TopicTranslationId topicTranslationId = new TopicTranslationId(topic.getTopicUuid(), defaultLanguage.getCode());

		topicTranslation.setId(topicTranslationId);
		topicTranslation.setTopicName(topic.getTopicName());
		topicTranslationRepository.save(topicTranslation);

		TopicWriteResponseDto topicWriteResponseDto = new TopicWriteResponseDto(topic.getTopicId(),
				topic.getTopicUuid(), topic.getTopicName(), topic.getDefaultLanguage().getName());

		return topicWriteResponseDto;
	}

	@Override
	public TopicReadDto findByTopicUuid(String topicUuid) {
		
		TopicReadDto topicReadDto = new TopicReadDto();
		Topic topic = topicRepository.findByTopicUuid(topicUuid);
		
		topicReadDto.setTopicId(topic.getTopicId());
		topicReadDto.setTopicUuid(topic.getTopicUuid());
		topicReadDto.setDefaultLanguage(topic.getDefaultLanguage().getCode());
		topicReadDto.setTopicName(topic.getTopicName());
		
		return topicReadDto;
	}	

}
