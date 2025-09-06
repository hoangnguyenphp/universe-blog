package com.hn369.universeblog.service.topic;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.topic.TopicTranslationWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteResponseDto;
import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;
import com.hn369.universeblog.service.entity.language.Language;
import com.hn369.universeblog.service.entity.topic.Topic;
import com.hn369.universeblog.service.entity.topic.TopicTranslation;
import com.hn369.universeblog.service.entity.topic.TopicTranslationId;
import com.hn369.universeblog.service.language.LanguageRepositoryIfc;

import jakarta.transaction.Transactional;

@Service
public class TopicService {

	@Autowired
	private TopicRepositoryIfc topicRepository;

	@Autowired
	private TopicTranslationRepositoryIfc topicTranslationRepository;
	
	@Autowired
	private LanguageRepositoryIfc languageRepository;

	@Transactional
	public TopicWriteResponseDto createTopic(TopicWriteRequestDto topicWriteDto) {
		
		Language defaultLanguage = languageRepository.findByCode(topicWriteDto.getDefaultLanguage());

		Topic topic = new Topic();

		topic.setTopicUuid(UUID.randomUUID().toString());
		topic.setTopicName(topicWriteDto.getTopicName());
		topic.setDefaultLanguage(defaultLanguage);

		topic = topicRepository.saveTopic(topic);

		TopicTranslation topicTranslation = new TopicTranslation();

		TopicTranslationId topicTranslationId = new TopicTranslationId(topic.getTopicUuid(), defaultLanguage.getCode());

		topicTranslation.setId(topicTranslationId);
		topicTranslation.setTopicName(topic.getTopicName());
		topicTranslationRepository.saveTopicTranslation(topicTranslation);

		TopicWriteResponseDto topicWriteResponseDto = new TopicWriteResponseDto(topic.getTopicId(),
				topic.getTopicUuid(), topic.getTopicName(), topic.getDefaultLanguage().getName());

		return topicWriteResponseDto;
	}

	@Transactional
	public TopicTranslationWriteResponseDto createTopicTranslation(
			TopicTranslationWriteRequestDto topicTranslationWriteRequestDto) {
		TopicTranslation topicTranslation = new TopicTranslation();

		TopicTranslationId topicTranslationId = new TopicTranslationId();
		topicTranslationId.setTopicUuid(topicTranslationWriteRequestDto.getTopic_uuid());
		topicTranslationId.setLanguageCode(topicTranslationWriteRequestDto.getLanguage());

		topicTranslation.setId(topicTranslationId);
		topicTranslation.setTopicName(topicTranslationWriteRequestDto.getTopicName());

		topicTranslation = topicTranslationRepository.saveTopicTranslation(topicTranslation);

		TopicTranslationWriteResponseDto topicTranslationWriteResponseDto = new TopicTranslationWriteResponseDto();
		topicTranslationWriteResponseDto.setTopic_uuid(topicTranslation.getId().getTopicUuid());
		topicTranslationWriteResponseDto.setLanguage(topicTranslation.getId().getLanguageCode());
		topicTranslationWriteResponseDto.setTopicName(topicTranslation.getTopicName());

		return topicTranslationWriteResponseDto;

	}
}