package com.hn369.universeblog.dto.article;

import java.time.LocalDateTime;

public class ArticleMasterSearchResponseDto {
    private String articleUuid;
    private String articleName;
    private String defaultLanguageCode;
    private String serialArticleUuid;
    private String topicUuid;
    private String topicName;
    private Integer chapterId;
    private String createdUser;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
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
	public String getDefaultLanguageCode() {
		return defaultLanguageCode;
	}
	public void setDefaultLanguageCode(String defaultLanguageCode) {
		this.defaultLanguageCode = defaultLanguageCode;
	}
	public String getSerialArticleUuid() {
		return serialArticleUuid;
	}
	public void setSerialArticleUuid(String serialArticleUuid) {
		this.serialArticleUuid = serialArticleUuid;
	}
	public String getTopicUuid() {
		return topicUuid;
	}
	public void setTopicUuid(String topicUuid) {
		this.topicUuid = topicUuid;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	
	public Integer getChapterId() {
		return chapterId;
	}
	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
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
}
