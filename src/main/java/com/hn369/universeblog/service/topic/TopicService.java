package com.hn369.universeblog.service.topic;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.hn369.universeblog.dto.topic.TopicByLanguageReadResponseDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteResponseDto;
import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;
import com.hn369.universeblog.service.entity.language.Language;
import com.hn369.universeblog.service.entity.topic.Topic;
import com.hn369.universeblog.service.entity.topic.TopicTranslation;
import com.hn369.universeblog.service.entity.topic.TopicTranslationId;
import com.hn369.universeblog.service.language.LanguageRepositoryIfc;
import com.hn369.universeblog.dto.topic.TopicTranslationReadResponseDto;

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

		topicTranslation.setTopicUuid(topic.getTopicUuid());
		topicTranslation.setLanguageCode(defaultLanguage.getCode());
		topicTranslation.setTopicName(topic.getTopicName());
		topicTranslationRepository.saveTopicTranslation(topicTranslation);

		TopicWriteResponseDto topicWriteResponseDto = new TopicWriteResponseDto(topic.getTopicId(),
				topic.getTopicUuid(), topic.getTopicName(), topic.getDefaultLanguage().getName());

		return topicWriteResponseDto;
	}
	
	public  List<TopicByLanguageReadResponseDto> retrieveTopicsByLanguageCode(@PathVariable String languageCode) {
		List<TopicByLanguageReadResponseDto> topicList = topicRepository.retrieveTopicsByLanguageCode(languageCode);
		return topicList;
	}
	
	@Transactional
	public TopicTranslationWriteResponseDto createTopicTranslation(
			TopicTranslationWriteRequestDto topicTranslationWriteRequestDto) {
		TopicTranslation topicTranslation = new TopicTranslation();

		topicTranslation.setTopicUuid(topicTranslationWriteRequestDto.getTopic_uuid());
		topicTranslation.setLanguageCode(topicTranslationWriteRequestDto.getLanguage());
		topicTranslation.setTopicName(topicTranslationWriteRequestDto.getTopicName());

		topicTranslation = topicTranslationRepository.saveTopicTranslation(topicTranslation);

		TopicTranslationWriteResponseDto topicTranslationWriteResponseDto = new TopicTranslationWriteResponseDto();
		topicTranslationWriteResponseDto.setTopic_uuid(topicTranslation.getTopicUuid());
		topicTranslationWriteResponseDto.setLanguage(topicTranslation.getLanguageCode());
		topicTranslationWriteResponseDto.setTopicName(topicTranslation.getTopicName());

		return topicTranslationWriteResponseDto;

	}
	
	public TopicTranslationReadResponseDto retrieveTopicTranslation(String topicUuid, String languageCode) {
		TopicTranslation topicTranslation = topicTranslationRepository.findByTopicUuidAndLanguageCode(topicUuid, languageCode);
		TopicTranslationReadResponseDto topicTranslationReadResponseDto = new TopicTranslationReadResponseDto();
		topicTranslationReadResponseDto.setTopicUuid(topicTranslation.getTopicUuid());
		topicTranslationReadResponseDto.setTopicName(topicTranslation.getTopicName());
		topicTranslationReadResponseDto.setLanguageCode(topicTranslation.getLanguageCode());
		return topicTranslationReadResponseDto;
	}
}