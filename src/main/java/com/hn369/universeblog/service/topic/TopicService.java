package com.hn369.universeblog.service.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.topic.TopicReadDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteResponseDto;
import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;

@Service
public class TopicService {

	@Autowired
	private TopicRepositoryIfc topicRepositoryIfc;

	@Autowired
	private TopicTranslationRepositoryIfc topicTranslationRepositoryIfc;

	public TopicWriteResponseDto createTopic(TopicWriteRequestDto topicWriteDto) {

		TopicWriteResponseDto topicWriteResponseDto = topicRepositoryIfc.createTopic(topicWriteDto);

		return topicWriteResponseDto;
	}

	public TopicTranslationWriteResponseDto createTopicTranslation(
			TopicTranslationWriteRequestDto topicTranslationWriteRequestDto) {

		TopicTranslationWriteResponseDto topicTranslationWriteResponseDto = new TopicTranslationWriteResponseDto();
		try {
			TopicReadDto masterTopic = topicRepositoryIfc.findByTopicUuid(topicTranslationWriteRequestDto.getTopic_uuid());
			if (masterTopic == null) {
				throw new Exception("The master topic does not exist.");
			}

			topicTranslationWriteResponseDto = topicTranslationRepositoryIfc
					.createTopicTranslation(topicTranslationWriteRequestDto);

		} catch (Exception e) {

		}

		return topicTranslationWriteResponseDto;

	}
}