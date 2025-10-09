package com.hn369.universeblog.controller.article;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.article.ArticleCreationRequestDto;
import com.hn369.universeblog.dto.article.ArticleCreationResponseDto;
import com.hn369.universeblog.dto.article.ArticleReadResponseDto;
import com.hn369.universeblog.dto.article.RelatedArticleReadResponseDto;
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
	
	@GetMapping("/articles/{articleUuid}/{languageCode}")
	public ResponseEntity<ArticleReadResponseDto> retrieveArticleByUuidAndLanguage(@PathVariable String articleUuid, @PathVariable String languageCode) {
		ArticleReadResponseDto articleReadResponseDto = articleService.retrieveArticleByUuidAndLanguage(articleUuid, languageCode);
		return ResponseEntity.ok(articleReadResponseDto);
	}
	
	@GetMapping("/articles/single-articles-by-topic-language/{topicUuid}/{languageCode}")
	public ResponseEntity<List<ArticleReadResponseDto>> getSingleArticlesByTopicAndLanguage (@PathVariable String topicUuid, 
																							 @PathVariable String languageCode,
																							 @RequestParam Map<String, String> allParams) {
		Integer quantity = (allParams != null && allParams.size() > 0) ? Integer.valueOf(allParams.get("quantity")) : null;
		List<ArticleReadResponseDto> articleList = articleService.getSingleArticlesByTopicAndLanguage(topicUuid, languageCode, quantity);
		return ResponseEntity.ok(articleList);
	}
	
	
	@GetMapping("/articles/hot-articles/{quantity}/{languageCode}")
	public ResponseEntity<List<ArticleReadResponseDto>> getHotArticles (@PathVariable Integer quantity, @PathVariable String languageCode) {
		List<ArticleReadResponseDto> articleList = articleService.getHotArticles(quantity, languageCode);
		return ResponseEntity.ok(articleList);
	}
	
	/**
	 * Get a serial article by serial article uuid, chapter id and language code
	 */
	@GetMapping("/articles/article-by-serial-article-chapter-language/{serialArticleUuid}/{chapterId}/{languageCode}")
	public ResponseEntity<ArticleReadResponseDto> getBySerialArticleAndChapterIdAndLanguage(@PathVariable String serialArticleUuid, @PathVariable Integer chapterId,
																							@PathVariable String languageCode) {
		ArticleReadResponseDto articleReadResponseDto = articleService.retrieveBySerialArticleAndChapterIdAndLanguage(serialArticleUuid, chapterId, languageCode);
		return ResponseEntity.ok(articleReadResponseDto);
		
	}
	
	@GetMapping("/articles/serial-article-chapters/{serialArticleUuid}/{languageCode}")
	public ResponseEntity<List<ArticleReadResponseDto>> getAllChaptersOfASerialArticle(
	    @PathVariable String serialArticleUuid, 
	    @PathVariable String languageCode,
	    @RequestParam(defaultValue = "0") int page,      // Default page 0
	    @RequestParam(defaultValue = "10") int size) {
		List<ArticleReadResponseDto> chapters = articleService.retrieveAllChaptersOfASerialArticle(serialArticleUuid, languageCode, page, size);
		return ResponseEntity.ok(chapters);
	}
	
	
	@GetMapping("/articles/relatead-articles/{articleUuid}/{languageCode}")
	public ResponseEntity<List<RelatedArticleReadResponseDto>> getRelatedArticlesByArticleUuid(@PathVariable String articleUuid, @PathVariable String languageCode,
		    @RequestParam(defaultValue = "0") int page,      // Default page 0
		    @RequestParam(defaultValue = "10") int size) {
		List<RelatedArticleReadResponseDto> relatedArticles = articleService.retrieveRelatedArticles(articleUuid, languageCode, page, size);
		return ResponseEntity.ok(relatedArticles);
	}

}
