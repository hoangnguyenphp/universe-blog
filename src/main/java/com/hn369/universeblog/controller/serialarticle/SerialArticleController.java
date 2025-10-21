package com.hn369.universeblog.controller.serialarticle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.serialarticle.SerialArticleReadResponseDto;
import com.hn369.universeblog.service.serialarticle.SerialArticleService;

import jakarta.websocket.server.PathParam;

@RestController
public class SerialArticleController {

	@Autowired
	private SerialArticleService serialArticleService;

	@GetMapping("/serial-articles/{masterTopicUuid}/{languageCode}")
	public ResponseEntity<List<SerialArticleReadResponseDto>> retrieveSerialArticleByMasterTopicAndLanguage(
			@PathVariable String masterTopicUuid, @PathVariable String languageCode) {
		List<SerialArticleReadResponseDto> serialArticlelist = serialArticleService
				.retrieveSerialArticleByMasterTopicAndLanguage(masterTopicUuid, languageCode);
		return ResponseEntity.ok(serialArticlelist);
	}

	@GetMapping("/serial-articles/{serialArticleUuid}")
	public ResponseEntity<SerialArticleReadResponseDto> getSerialArticleByUuidAndLanguage(
			@PathVariable String serialArticleUuid, @PathParam("languageCode") String languageCode) {
		languageCode = languageCode != null ? languageCode : "en";
		SerialArticleReadResponseDto serialArticle = serialArticleService
				.findSerialArticleByUuidAndLanguage(serialArticleUuid, languageCode);
		return ResponseEntity.ok(serialArticle);
	}

	/* For admin to create a serial chapter */
	@GetMapping("/serial-articles")
	public ResponseEntity<List<SerialArticleReadResponseDto>> getAllSerialArticles() {
		List<SerialArticleReadResponseDto> serialArticle = serialArticleService.retrieveAllSerialArticles();
		return ResponseEntity.ok(serialArticle);
	}
}
