package com.hn369.universeblog.controller.acticaltranslation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.articletranslation.ArticleTranslationCreationResponseDto;
import com.hn369.universeblog.dto.articletranslation.ArticleTranslationCreationResquestDto;
import com.hn369.universeblog.dto.articletranslation.ArticleTranslationUpdateRequestDto;
import com.hn369.universeblog.dto.articletranslation.ArticleTranslationUpdateResponseDto;
import com.hn369.universeblog.service.articletranslation.ArticleTranslationService;

@RestController
public class ArticleTranslationController {
	@Autowired
	ArticleTranslationService articleTranslationService;
	
	@PatchMapping("/article-translations")
	public ResponseEntity<ArticleTranslationUpdateResponseDto> updateArticleTranslation(@RequestBody ArticleTranslationUpdateRequestDto articleTranslationUpdateRequestDto) {
		ArticleTranslationUpdateResponseDto articleTranslationUpdateResponseDto = articleTranslationService.updateArticleTranslation(articleTranslationUpdateRequestDto);
		return ResponseEntity.ok(articleTranslationUpdateResponseDto);
		
	}

	@PostMapping("/article-translations")
	public ResponseEntity<ArticleTranslationCreationResponseDto> createArticleTranslation(@RequestBody ArticleTranslationCreationResquestDto articleTranslationCreationRequestDto) {
		ArticleTranslationCreationResponseDto articleTranslationCreationResponseDto = articleTranslationService.createArticleTranslation(articleTranslationCreationRequestDto);
		return ResponseEntity.ok(articleTranslationCreationResponseDto);
		
	}
}
