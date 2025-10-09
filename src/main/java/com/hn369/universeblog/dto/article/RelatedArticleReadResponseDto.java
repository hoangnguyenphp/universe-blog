package com.hn369.universeblog.dto.article;

import java.time.LocalDateTime;

public class RelatedArticleReadResponseDto {
    private String articleUuid;

    private String articleName;
    
    private Integer viewCounter;
    
    private LocalDateTime dateCreated;
    
    private String createdUser;
    
    private Boolean isSerialArticleMaster;
    
    private Integer topicOverlap;

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

	public Integer getViewCounter() {
		return viewCounter;
	}

	public void setViewCounter(Integer viewCounter) {
		this.viewCounter = viewCounter;
	}

	public LocalDateTime getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(LocalDateTime dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getCreatedUser() {
		return createdUser;
	}

	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}

	public Boolean getIsSerialArticleMaster() {
		return isSerialArticleMaster;
	}

	public void setIsSerialArticleMaster(Boolean isSerialArticleMaster) {
		this.isSerialArticleMaster = isSerialArticleMaster;
	}

	public Integer getTopicOverlap() {
		return topicOverlap;
	}

	public void setTopicOverlap(Integer topicOverlap) {
		this.topicOverlap = topicOverlap;
	}
}
