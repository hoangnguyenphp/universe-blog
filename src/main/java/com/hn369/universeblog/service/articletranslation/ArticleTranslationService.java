package com.hn369.universeblog.service.articletranslation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.articletranslation.ArticleTranslationCreationResponseDto;
import com.hn369.universeblog.dto.articletranslation.ArticleTranslationCreationResquestDto;
import com.hn369.universeblog.dto.articletranslation.ArticleTranslationUpdateRequestDto;
import com.hn369.universeblog.dto.articletranslation.ArticleTranslationUpdateResponseDto;
import com.hn369.universeblog.service.article.ArticleRepositoryIfc;
import com.hn369.universeblog.service.article.ArticleTranslationRepositoryIfc;
import com.hn369.universeblog.service.entity.article.Article;
import com.hn369.universeblog.service.entity.article.ArticleTranslation;

@Service
public class ArticleTranslationService {

	@Autowired
	private ArticleTranslationRepositoryIfc articleTranslationRepository;
	
	@Autowired
	private ArticleRepositoryIfc articleRepository;
	
	public ArticleTranslationUpdateResponseDto updateArticleTranslation(ArticleTranslationUpdateRequestDto articleTranslationUpdateRequestDto) {
		Article article = articleRepository.findByArticleUuidAndDefaultLanguageCode(articleTranslationUpdateRequestDto.getArticleUuid(),articleTranslationUpdateRequestDto.getLanguageCode());
		
		if (article != null) {
			if (articleTranslationUpdateRequestDto.getArticleName() != null ) {
				article.setArticleName(articleTranslationUpdateRequestDto.getArticleName());
			}
			if (articleTranslationUpdateRequestDto.getArticleContent() != null) {
				article.setArticleContent(articleTranslationUpdateRequestDto.getArticleContent());
			}
			
			articleRepository.saveArticle(article);
		}
		
		ArticleTranslation articleTranslation = articleTranslationRepository.findArticleTranslationById(articleTranslationUpdateRequestDto.getArticleUuid(), articleTranslationUpdateRequestDto.getLanguageCode());
		if (articleTranslationUpdateRequestDto.getArticleName() != null ) {
			articleTranslation.setArticleName(articleTranslationUpdateRequestDto.getArticleName());
		}
		if (articleTranslationUpdateRequestDto.getArticleContent() != null) {
			articleTranslation.setArticleContent(articleTranslationUpdateRequestDto.getArticleContent());
		}
		
		articleTranslationRepository.saveArticleTranslation(articleTranslation);
		
		
		
		ArticleTranslationUpdateResponseDto articleTranslationUpdateResponseDto = new ArticleTranslationUpdateResponseDto();
		articleTranslationUpdateResponseDto.setArticleUuid(articleTranslation.getArticleUuid());
		articleTranslationUpdateResponseDto.setArticleName(articleTranslation.getArticleName());
		articleTranslationUpdateResponseDto.setArticleContent(articleTranslation.getArticleContent());
		articleTranslationUpdateResponseDto.setDateUpdated(articleTranslation.getDateUpdated());
		articleTranslationUpdateResponseDto.setLanguageCode(articleTranslation.getLanguageCode());
		articleTranslationUpdateResponseDto.setUpdatedUser(articleTranslation.getUpdatedUser());		
		return articleTranslationUpdateResponseDto;
	}
	
	public ArticleTranslationCreationResponseDto createArticleTranslation(ArticleTranslationCreationResquestDto articleTranslationCreationResquestDto) {
		ArticleTranslation articleTranslation = new ArticleTranslation();
		articleTranslation.setArticleUuid(articleTranslationCreationResquestDto.getArticleTranslationMasterUuid());
		articleTranslation.setLanguageCode(articleTranslationCreationResquestDto.getLanguageCode());
		articleTranslation.setArticleName(articleTranslationCreationResquestDto.getArticleName());
		articleTranslation.setArticleContent(articleTranslationCreationResquestDto.getArticleContent());
		articleTranslation.setSerialArticleUuid(articleTranslationCreationResquestDto.getSerialArticleUuid());
		articleTranslation.setChapterId(articleTranslationCreationResquestDto.getChapterId());
		articleTranslationRepository.saveArticleTranslation(articleTranslation);
		
		
		ArticleTranslationCreationResponseDto newArticleResponse = new ArticleTranslationCreationResponseDto();
		newArticleResponse.setArticleUuid(articleTranslation.getArticleUuid());
		newArticleResponse.setArticleName(articleTranslation.getArticleName());
		newArticleResponse.setArticleContent(articleTranslation.getArticleContent());
		newArticleResponse.setCreatedDated(articleTranslation.getDateCreated());
		newArticleResponse.setLanguageCode(articleTranslation.getLanguageCode());
		newArticleResponse.setUpdatedUser(articleTranslation.getUpdatedUser());		
		return newArticleResponse;
	}
}
