package com.hn369.universeblog.service.entity.articletopic;

import java.io.Serializable;
import java.util.Objects;

public class ArticleTopicId implements Serializable {

    private String articleUuid;
    private String topicUuid;

    // Constructors
    public ArticleTopicId() {
    }

    public ArticleTopicId(String articleUuid, String topicUuid) {
        this.articleUuid = articleUuid;
        this.topicUuid = topicUuid;
    }

    // Getters and Setters
    public String getArticleUuid() {
        return articleUuid;
    }

    public void setArticleUuid(String articleUuid) {
        this.articleUuid = articleUuid;
    }

    public String getTopicUuid() {
        return topicUuid;
    }

    public void setTopicUuid(String topicUuid) {
        this.topicUuid = topicUuid;
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleTopicId that = (ArticleTopicId) o;
        return Objects.equals(articleUuid, that.articleUuid) &&
               Objects.equals(topicUuid, that.topicUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleUuid, topicUuid);
    }
}
