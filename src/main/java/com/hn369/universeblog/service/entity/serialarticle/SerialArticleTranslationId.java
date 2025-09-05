package com.hn369.universeblog.service.entity.serialarticle;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class SerialArticleTranslationId implements Serializable {

    @Column(name = "serial_article_uuid", length = 100, nullable = false)
    private String serialArticleUuid;

    @Column(name = "language_code", length = 50, nullable = false)
    private String languageCode;

    // --- Constructors ---
    public SerialArticleTranslationId() {}

    public SerialArticleTranslationId(String serialArticleUuid, String languageCode) {
        this.serialArticleUuid = serialArticleUuid;
        this.languageCode = languageCode;
    }

    // --- Getters and Setters ---
    public String getSerialArticleUuid() {
        return serialArticleUuid;
    }

    public void setSerialArticleUuid(String serialArticleUuid) {
        this.serialArticleUuid = serialArticleUuid;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    // --- equals & hashCode ---
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SerialArticleTranslationId)) return false;
        SerialArticleTranslationId that = (SerialArticleTranslationId) o;
        return Objects.equals(serialArticleUuid, that.serialArticleUuid)
                && Objects.equals(languageCode, that.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialArticleUuid, languageCode);
    }
}
