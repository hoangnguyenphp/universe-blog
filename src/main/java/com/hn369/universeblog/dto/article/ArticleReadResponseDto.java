package com.hn369.universeblog.dto.article;

import java.time.LocalDateTime;
import java.util.List;

public class ArticleReadResponseDto {
    private String articleUuid;

    private String articleName;

    private String articleContent;

    private String masterTopic;
    
    private String masterTopicUuid;
    
    private String languageCode;
    
    private String languageName;
    
    private List<String> relatedTopics;
    
    private String serialArticle;

    private Integer viewCounter;

    private String defaultLanguage;

    private LocalDateTime dateCreated;

    private LocalDateTime dateUpdated;

    private String createdUser;

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

	public String getMasterTopic() {
		return masterTopic;
	}
	
	public void setMasterTopic(String masterTopic) {
		this.masterTopic = masterTopic;
	}
	
	public String getMasterTopicUuid() {
		return masterTopicUuid;
	}

	public void setMasterTopicUuid(String masterTopicUuid) {
		this.masterTopicUuid = masterTopicUuid;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getLanguageName() {
		return languageName;
	}

	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	public List<String> getRelatedTopics() {
		return relatedTopics;
	}

	public void setRelatedTopics(List<String> relatedTopics) {
		this.relatedTopics = relatedTopics;
	}

	public String getSerialArticle() {
		return serialArticle;
	}

	public void setSerialArticle(String serialArticle) {
		this.serialArticle = serialArticle;
	}

	public Integer getViewCounter() {
		return viewCounter;
	}

	public void setViewCounter(Integer viewCounter) {
		this.viewCounter = viewCounter;
	}

	public String getDefaultLanguage() {
		return defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public LocalDateTime getDateUpdated() {
		return dateUpdated;
	}

	public void setDateUpdated(LocalDateTime dateUpdated) {
		this.dateUpdated = dateUpdated;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public String getUpdatedUser() {
		return updatedUser;
	}

	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}
    
}
