package com.hn369.universeblog.controller.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.topic.TopicWriteRequestDto;
import com.hn369.universeblog.dto.topic.TopicWriteResponseDto;
import com.hn369.universeblog.service.topic.TopicService;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@PostMapping("/topics")
	public ResponseEntity<TopicWriteResponseDto> createTopic(@RequestBody TopicWriteRequestDto topicWriteRequestDto) {
		TopicWriteResponseDto topicWriteResponseDto = topicService.saveTopic(topicWriteRequestDto);
		return ResponseEntity.ok(topicWriteResponseDto);
	}

}
