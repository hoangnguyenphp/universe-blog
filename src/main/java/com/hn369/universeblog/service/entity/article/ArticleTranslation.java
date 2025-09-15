package com.hn369.universeblog.service.entity.article;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "article_translation")
@IdClass(ArticleTranslationId.class)
public class ArticleTranslation {

    @Id
    @Column(name = "article_uuid", nullable = false, length = 100)
    private String articleUuid;

    @Id
    @Column(name = "language_code", nullable = false, length = 50)
    private String languageCode;

    @Column(name = "article_name", length = 255)
    private String articleName;

    @Column(name = "article_content", columnDefinition = "TEXT")
    private String articleContent;

    @Column(name = "serial_article_uuid", length = 100)
    private String serialArticleUuid;

    @Column(name = "date_created", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateCreated = LocalDateTime.now();

    @Column(name = "date_updated", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime dateUpdated;

    @Column(name = "created_user", length = 100)
    private String createdUser;

    @Column(name = "updated_user", length = 100)
    private String updatedUser;
    
    @Column(name="chapter_id")
    private Integer chapterId;

    // Getters and Setters
    public String getArticleUuid() {
        return articleUuid;
    }

    public void setArticleUuid(String articleUuid) {
        this.articleUuid = articleUuid;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
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

    public String getSerialArticleUuid() {
        return serialArticleUuid;
    }

    public void setSerialArticleUuid(String serialArticleUuid) {
        this.serialArticleUuid = serialArticleUuid;
    }

    public Integer getChapterId() {
		return chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
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