package com.hn369.universeblog.service.article;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.article.ArticleCreationRequestDto;
import com.hn369.universeblog.dto.article.ArticleCreationResponseDto;
import com.hn369.universeblog.dto.article.ArticleReadResponseDto;
import com.hn369.universeblog.service.articletopic.ArticleTopicRepositoryIfc;
import com.hn369.universeblog.service.entity.article.Article;
import com.hn369.universeblog.service.entity.article.ArticleTranslation;
import com.hn369.universeblog.service.entity.articletopic.ArticleTopic;
import com.hn369.universeblog.service.entity.language.Language;
import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;
import com.hn369.universeblog.service.entity.topic.Topic;
import com.hn369.universeblog.service.language.LanguageRepositoryIfc;
import com.hn369.universeblog.service.serialarticle.SerialArticleRepositoryIfc;
import com.hn369.universeblog.service.topic.TopicRepositoryIfc;

import jakarta.transaction.Transactional;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepositoryIfc articleRepository;

	@Autowired
	private SerialArticleRepositoryIfc serialArticleRepository;

	@Autowired
	private LanguageRepositoryIfc languageRepository;

	@Autowired
	private ArticleTopicRepositoryIfc articleTopicRepository;

	@Autowired
	private TopicRepositoryIfc topicRepository;

	@Autowired
	private ArticleTranslationRepositoryIfc articleTranslationRepository;

	@Transactional
	public ArticleCreationResponseDto createArticle(ArticleCreationRequestDto articleCreationRequestDto) {
		ArticleCreationResponseDto articleCreationResponseDto = new ArticleCreationResponseDto();
		try {
			SerialArticle serialArticle = serialArticleRepository
					.findByUuid(articleCreationRequestDto.getSerialArticleUuid());
			Language defaultLanguage = languageRepository.findByCode(articleCreationRequestDto.getDefaultLanguage());
			
			Integer currentChapter = null;

			// Create new article
			Article newArticle = new Article();
			newArticle.setArticleName(articleCreationRequestDto.getArticleName());
			newArticle.setArticleContent(articleCreationRequestDto.getArticleContent());
			newArticle.setSerialArticle(serialArticle);
			newArticle.setViewCounter(articleCreationRequestDto.getViewCounter());
			newArticle.setDefaultLanguage(defaultLanguage);
			if (serialArticle != null) {
				currentChapter = articleRepository.countArticleOfASerialArticle(serialArticle);
				newArticle.setChapterId(currentChapter + 1);
			}
			newArticle = articleRepository.createArticle(newArticle);

			// Save article_topic
			Topic masterTopic = topicRepository.findByTopicUuid(articleCreationRequestDto.getMasterTopicUuid());

			ArticleTopic newArticleTopic = new ArticleTopic();
			newArticleTopic.setArticleUuid(newArticle.getArticleUuid());
			newArticleTopic.setTopicUuid(masterTopic.getTopicUuid());
			newArticleTopic.setMatterTopic(true);
			articleTopicRepository.saveArticleTopic(newArticleTopic);

			// Save article_translation
			ArticleTranslation articleTranslation = new ArticleTranslation();
			articleTranslation.setArticleUuid(newArticle.getArticleUuid());
			articleTranslation.setArticleName(newArticle.getArticleName());
			articleTranslation.setArticleContent(newArticle.getArticleContent());
			articleTranslation.setLanguageCode(newArticle.getDefaultLanguage().getCode());
			articleTranslation.setSerialArticleUuid(articleCreationRequestDto.getSerialArticleUuid());
			articleTranslation.setChapterId(currentChapter != null ? currentChapter + 1: null);
			articleTranslationRepository.saveArticleTranslation(articleTranslation);

			// return new article response
			articleCreationResponseDto.setArticleName(newArticle.getArticleName());
			articleCreationResponseDto.setArticleContent(newArticle.getArticleContent());
			articleCreationResponseDto.setArticleUuid(newArticle.getArticleUuid());
			articleCreationResponseDto.setDateCreated(newArticle.getDateCreated());
			articleCreationResponseDto.setDateUpdated(newArticle.getDateUpdated());
			articleCreationResponseDto.setDefaultLanguage(defaultLanguage.getCode());
			articleCreationResponseDto.setMasterTopic(masterTopic.getTopicName());
			articleCreationResponseDto.setSerialArticle(
					newArticle.getSerialArticle() != null ? newArticle.getSerialArticle().getName() : null);
			articleCreationResponseDto.setCreatedUser(newArticle.getCreatedUser());
			articleCreationResponseDto.setUpdatedUser(newArticle.getUpdatedUser());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return articleCreationResponseDto;
	}
	
	public ArticleReadResponseDto retrieveArticle(String articleUuid) {
		ArticleReadResponseDto articleReadResponseDto = new ArticleReadResponseDto();
		Article article = articleRepository.retrieveArticle(articleUuid);
		articleReadResponseDto.setArticleUuid(article.getArticleUuid());
		articleReadResponseDto.setArticleName(article.getArticleName());
		articleReadResponseDto.setArticleContent(article.getArticleContent());
		return articleReadResponseDto;
	}
	
	public ArticleReadResponseDto retrieveArticleByUuidAndLanguage(String articleUuid, String languageCode) {
		ArticleReadResponseDto articleReadResponseDto = articleRepository.retrieveArticleByUuidAndLanguage(articleUuid, languageCode);
		return articleReadResponseDto;
	}
	
	public List<ArticleReadResponseDto> getSingleArticlesByTopicAndLanguage(String topicUuid, String languageCode) {
		List<ArticleReadResponseDto> articleList = articleRepository.getSingleArticlesByTopicAndLanguage(topicUuid, languageCode);
		return articleList;
		
	}
	
	public List<ArticleReadResponseDto> getHotArticles(Integer quantity, String languageCode) {
		List<ArticleReadResponseDto> hotArticles = articleRepository.retrieveHotArticles(quantity, languageCode);
		return hotArticles;
	}
	
	public ArticleReadResponseDto retrieveBySerialArticleAndChapterIdAndLanguage(String serialArticleUuid, Integer chapterId, String languageCode) {
		ArticleReadResponseDto articleReadResponseDto = articleRepository.retrieveBySerialArticleAndChapterIdAndLanguage(serialArticleUuid, chapterId, languageCode);
		return articleReadResponseDto;
	}
} 
