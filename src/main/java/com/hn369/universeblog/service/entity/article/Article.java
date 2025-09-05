package com.hn369.universeblog.service.entity.article;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

import com.hn369.universeblog.service.entity.language.Language;
import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;

@Entity
@Table(name = "article")
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "article_id", nullable = false, updatable = false)
    private Long articleId;

    @Column(name = "article_uuid", length = 100, nullable = false, unique = true)
    private String articleUuid;

    @Column(name = "article_name", length = 255)
    private String articleName;

    @Column(name = "article_content", columnDefinition = "TEXT")
    private String articleContent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "serial_article_uuid",
        referencedColumnName = "serial_article_uuid",
        foreignKey = @ForeignKey(name = "fk_article_serial")
    )
    private SerialArticle serialArticle;

    @Column(name = "view_counter", nullable = false)
    private Integer viewCounter = 0;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "default_language_code",
        referencedColumnName = "language_code",
        foreignKey = @ForeignKey(name = "fk_article_language")
    )
    private Language defaultLanguage;

    @Column(name = "date_created", nullable = false, updatable = false)
    private LocalDateTime dateCreated = LocalDateTime.now();

    @Column(name = "date_updated", nullable = false)
    private LocalDateTime dateUpdated = LocalDateTime.now();

    @Column(name = "created_user", length = 100)
    private String createdUser;

    @Column(name = "updated_user", length = 100)
    private String updatedUser;

    // Constructors
    public Article() {
        this.articleUuid = UUID.randomUUID().toString();
    }

    public Article(String articleName, String articleContent, SerialArticle serialArticle, Language defaultLanguage) {
        this.articleUuid = UUID.randomUUID().toString();
        this.articleName = articleName;
        this.articleContent = articleContent;
        this.serialArticle = serialArticle;
        this.defaultLanguage = defaultLanguage;
    }

    // Getters and Setters
    public Long getArticleId() {
        return articleId;
    }

    public String getArticleUuid() {
        return articleUuid;
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

    public SerialArticle getSerialArticle() {
        return serialArticle;
    }

    public void setSerialArticle(SerialArticle serialArticle) {
        this.serialArticle = serialArticle;
    }

    public Integer getViewCounter() {
        return viewCounter;
    }

    public void setViewCounter(Integer viewCounter) {
        this.viewCounter = viewCounter;
    }

    public Language getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(Language defaultLanguage) {
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

    // Auto-update dateUpdated
    @PreUpdate
    public void preUpdate() {
        this.dateUpdated = LocalDateTime.now();
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Objects.equals(articleId, article.articleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId);
    }

    // ToString
    @Override
    public String toString() {
        return "Article{" +
               "articleId=" + articleId +
               ", articleUuid='" + articleUuid + '\'' +
               ", articleName='" + articleName + '\'' +
               ", articleContent='" + (articleContent != null ? articleContent.substring(0, Math.min(articleContent.length(), 50)) : null) + '\'' +
               ", serialArticle=" + (serialArticle != null ? serialArticle.getUuid() : null) +
               ", viewCounter=" + viewCounter +
               ", defaultLanguage=" + (defaultLanguage != null ? defaultLanguage.getCode(): null) +
               ", dateCreated=" + dateCreated +
               ", dateUpdated=" + dateUpdated +
               ", createdUserUuid='" + createdUser + '\'' +
               ", updatedUserUuid='" + updatedUser + '\'' +
               '}';
    }
}