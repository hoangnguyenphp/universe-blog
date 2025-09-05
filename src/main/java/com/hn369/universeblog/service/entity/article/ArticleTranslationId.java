package com.hn369.universeblog.service.entity.article;

import java.util.Objects;

// Composite Primary Key Class
public class ArticleTranslationId implements java.io.Serializable {
    private String articleUuid;
    private String languageCode;

    public ArticleTranslationId() {}

    public ArticleTranslationId(String articleUuid, String languageCode) {
        this.articleUuid = articleUuid;
        this.languageCode = languageCode;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleTranslationId that = (ArticleTranslationId) o;
        return Objects.equals(articleUuid, that.articleUuid) &&
               Objects.equals(languageCode, that.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleUuid, languageCode);
    }
}