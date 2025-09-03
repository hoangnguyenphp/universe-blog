package com.hn369.universeblog.infra.repository.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.dto.topic.TopicTranslationWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteResponseDto;
import com.hn369.universeblog.service.entity.topic.TopicTranslation;
import com.hn369.universeblog.service.entity.topic.TopicTranslationId;
import com.hn369.universeblog.service.topic.TopicTranslationRepositoryIfc;

import jakarta.transaction.Transactional;

@Repository
public class TopicTranslationRepositoryImpl implements TopicTranslationRepositoryIfc {

	@Autowired
	private TopicTranslationJpaRepository topicTranslationRepository;

	@Override
	@Transactional
	public TopicTranslationWriteResponseDto createTopicTranslation(
			TopicTranslationWriteRequestDto topicTranslationWriteRequestDto) {

		TopicTranslation topicTranslation = new TopicTranslation();

		TopicTranslationId topicTranslationId = new TopicTranslationId();
		topicTranslationId.setTopicUuid(topicTranslationWriteRequestDto.getTopic_uuid());
		topicTranslationId.setLanguageCode(topicTranslationWriteRequestDto.getLanguage());

		topicTranslation.setId(topicTranslationId);
		topicTranslation.setTopicName(topicTranslationWriteRequestDto.getTopicName());

		topicTranslation = topicTranslationRepository.save(topicTranslation);

		TopicTranslationWriteResponseDto topicTranslationWriteResponseDto = new TopicTranslationWriteResponseDto();
		topicTranslationWriteResponseDto.setTopic_uuid(topicTranslation.getId().getTopicUuid());
		topicTranslationWriteResponseDto.setLanguage(topicTranslation.getId().getLanguageCode());
		topicTranslationWriteResponseDto.setTopicName(topicTranslation.getTopicName());

		return topicTranslationWriteResponseDto;
	}
	
	@Override
	public TopicTranslation findByTopicUuidAndLanguageCode(String topicUuid, String languageCode) {
		TopicTranslation topicTranslation = topicTranslationRepository.findById(new TopicTranslationId(topicUuid, languageCode)).orElse(null);
		return topicTranslation;
	}

}
