package com.hn369.universeblog.service.entity.topic;

import java.io.Serializable;
import java.util.Objects;

public class TopicTranslationId implements Serializable {
    private String topicUuid;

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