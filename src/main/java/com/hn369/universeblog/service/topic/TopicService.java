package com.hn369.universeblog.service.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;
import com.hn369.universeblog.entity.language.Language;
import com.hn369.universeblog.entity.topic.Topic;
import com.hn369.universeblog.entity.topic.TopicTranslation;
import com.hn369.universeblog.entity.topic.TopicTranslationId;
import com.hn369.universeblog.repository.topic.TopicRepository;
import com.hn369.universeblog.repository.topic.TopicTranslationRepository;
import com.hn369.universeblog.service.language.LanguageService;

import java.util.UUID;

@Service
public class TopicService {
	
	@Autowired
	private LanguageService languageService;
	
	@Autowired
	private TopicRepository topicRepository;
	
	@Autowired
	private TopicTranslationRepository topicTranslationRepository;
	
	public TopicWriteResponseDto saveTopic(TopicWriteRequestDto topicWriteDto) {
		
		Language defaultLanguage = languageService.retriveByLanguageCode(topicWriteDto.getDefaultLanguage());
		
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
		
		TopicWriteResponseDto topicWriteResponseDto = new TopicWriteResponseDto(topic.getTopicId(), topic.getTopicUuid(),
				topic.getTopicName(), topic.getDefaultLanguage().getName());
		
		return topicWriteResponseDto;
	}
}