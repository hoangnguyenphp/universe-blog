package com.hn369.universeblog.dto.article;

import java.time.LocalDateTime;
import java.util.List;

public class ArticleCreationRequestDto {

    private String articleName;
    
    private String masterTopicUuid;
    
    private List<String> relatedTopicUuidList;

    private String articleContent;

    private String serialArticleUuid;

    private String defaultLanguage;

    private LocalDateTime dateCreated;

    private LocalDateTime dateUpdated;

    private String createdUser;

    private String updatedUser;

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	
	public String getMasterTopicUuid() {
		return masterTopicUuid;
	}

	public void setMasterTopicUuid(String masterTopicUuid) {
		this.masterTopicUuid = masterTopicUuid;
	}

	public List<String> getRelatedTopicUuidList() {
		return relatedTopicUuidList;
	}

	public void setRelatedTopicUuidList(List<String> relatedTopicUuidList) {
		this.relatedTopicUuidList = relatedTopicUuidList;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getSerialArticleUuid() {
		return serialArticleUuid;
	}

	public void setSerialArticleUuid(String serialArticleUuid) {
		this.serialArticleUuid = serialArticleUuid;
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
