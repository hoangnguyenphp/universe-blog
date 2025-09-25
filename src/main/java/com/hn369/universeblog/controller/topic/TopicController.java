package com.hn369.universeblog.controller.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.topic.TopicByLanguageReadResponseDto;
import com.hn369.universeblog.dto.topic.TopicTranslationReadResponseDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicTranslationWriteResponseDto;
import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;
import com.hn369.universeblog.service.topic.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@PostMapping("/topics")
	public ResponseEntity<TopicWriteResponseDto> createTopic(@RequestBody TopicWriteRequestDto topicWriteRequestDto) {
		TopicWriteResponseDto topicWriteResponseDto = topicService.createTopic(topicWriteRequestDto);
		return ResponseEntity.ok(topicWriteResponseDto);
	}
	
	
	@GetMapping("/topics/{languageCode}")
	ResponseEntity<List<TopicByLanguageReadResponseDto>> retrieveTopicsByLanguageCode(@PathVariable String languageCode) {
		List<TopicByLanguageReadResponseDto> topicList = topicService.retrieveTopicsByLanguageCode(languageCode);
		return ResponseEntity.ok(topicList);
	}
	
	@PostMapping("/topic-translations")
	public ResponseEntity<TopicTranslationWriteResponseDto> createTopicTranslation(@RequestBody TopicTranslationWriteRequestDto topicTranslationWriteRequestDto) {
		TopicTranslationWriteResponseDto topicTranslationWriteResponseDto = topicService.createTopicTranslation(topicTranslationWriteRequestDto);
		return ResponseEntity.ok(topicTranslationWriteResponseDto);
	}
	
	@GetMapping("/topic-translations/{topicUuid}/{languageCode}")
	public ResponseEntity<TopicTranslationReadResponseDto> retrieveTopicTranslation(@PathVariable String topicUuid, @PathVariable String languageCode) {
		TopicTranslationReadResponseDto topicTranslationReadResponseDto = topicService.retrieveTopicTranslation(topicUuid, languageCode);
		return ResponseEntity.ok(topicTranslationReadResponseDto);
	}

}
