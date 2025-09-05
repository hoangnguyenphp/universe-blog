package com.hn369.universeblog.controller.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.article.ArticleCreationRequestDto;
import com.hn369.universeblog.dto.article.ArticleCreationResponseDto;
import com.hn369.universeblog.dto.article.ArticleReadResponseDto;
import com.hn369.universeblog.service.article.ArticleService;

@RestController
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}
	
	@PostMapping("/articles")
	public ResponseEntity<ArticleCreationResponseDto> createArticle(@RequestBody ArticleCreationRequestDto articleCreationRequestDto) {
		ArticleCreationResponseDto articleCreationResponseDto = articleService.createArticle(articleCreationRequestDto);
		
		return ResponseEntity.ok(articleCreationResponseDto);
	}
	
	@GetMapping("/articles/{articleUuid}")
	public ResponseEntity<ArticleReadResponseDto> getArticle(@PathVariable String articleUuid) {
		ArticleReadResponseDto articleReadResponseDto = articleService.retrieveArticle(articleUuid);
		return ResponseEntity.ok(articleReadResponseDto);
	}

}
