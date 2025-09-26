package com.hn369.universeblog.controller.serialarticle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.serialarticle.SerialArticleReadResponseDto;
import com.hn369.universeblog.service.serialarticle.SerialArticleService;

@RestController
public class SerialArticleController {
	
	@Autowired
	private SerialArticleService serialArticleService;
	
	@GetMapping("/serial-articles/{masterTopicUuid}/{languageCode}")
	public ResponseEntity<List<SerialArticleReadResponseDto>> retrieveSerialArticleByMasterTopicAndLanguage(@PathVariable String masterTopicUuid, @PathVariable String languageCode) {
		List<SerialArticleReadResponseDto> serialArticlelist = serialArticleService.retrieveSerialArticleByMasterTopicAndLanguage(masterTopicUuid, languageCode);
		return ResponseEntity.ok(serialArticlelist);
	}
}
