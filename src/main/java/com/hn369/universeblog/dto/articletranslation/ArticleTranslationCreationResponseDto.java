package com.hn369.universeblog.dto.articletranslation;

import java.time.LocalDateTime;

public class ArticleTranslationCreationResponseDto {
	private String articleUuid;
	
    private String articleName;
    
    private String articleContent;

    private String languageCode;

    private LocalDateTime createdDated;
    
    private String updatedUser;

	public String getArticleUuid() {
		return articleUuid;
	}

	public void setArticleUuid(String articleUuid) {
		this.articleUuid = articleUuid;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public LocalDateTime getCreatedDated() {
		return createdDated;
	}

	public void setCreatedDated(LocalDateTime createdDated) {
		this.createdDated = createdDated;
	}

	public String getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}    
}
