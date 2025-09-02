package com.hn369.universeblog.entity.topic;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class TopicTranslationId implements Serializable {

    @Column(name = "topic_uuid", length = 100, nullable = false)
    private String topicUuid;

    @Column(name = "language_code", length = 50, nullable = false)
    private String languageCode;

    public TopicTranslationId() {
    }

    public TopicTranslationId(String topicUuid, String languageCode) {
        this.topicUuid = topicUuid;
        this.languageCode = languageCode;
    }

    public String getTopicUuid() {
        return topicUuid;
    }

    public void setTopicUuid(String topicUuid) {
        this.topicUuid = topicUuid;
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
        if (!(o instanceof TopicTranslationId)) return false;
        TopicTranslationId that = (TopicTranslationId) o;
        return Objects.equals(topicUuid, that.topicUuid) &&
               Objects.equals(languageCode, that.languageCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topicUuid, languageCode);
    }
}