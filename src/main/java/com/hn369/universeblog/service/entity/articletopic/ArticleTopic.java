package com.hn369.universeblog.service.entity.articletopic;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "article_topic")
@IdClass(ArticleTopicId.class)
public class ArticleTopic implements Serializable {

    @Id
    @Column(name = "article_uuid", length = 100, nullable = false)
    private String articleUuid;

    @Id
    @Column(name = "topic_uuid", length = 100, nullable = false)
    private String topicUuid;

    @Column(name = "master_topic", nullable = false)
    private boolean masterTopic = false;

    // Constructors
    public ArticleTopic() {
    }

    public ArticleTopic(String articleUuid, String topicUuid, boolean masterTopic) {
        this.articleUuid = articleUuid;
        this.topicUuid = topicUuid;
        this.masterTopic = masterTopic;
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

    public boolean isMasterTopic() {
		return masterTopic;
	}

	public void setMasterTopic(boolean masterTopic) {
		this.masterTopic = masterTopic;
	}

	// Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleTopic that = (ArticleTopic) o;
        return masterTopic == that.masterTopic &&
               Objects.equals(articleUuid, that.articleUuid) &&
               Objects.equals(topicUuid, that.topicUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleUuid, topicUuid, masterTopic);
    }

    // ToString
    @Override
    public String toString() {
        return "ArticleTopic{" +
               "articleUuid='" + articleUuid + '\'' +
               ", topicUuid='" + topicUuid + '\'' +
               ", masterTopic=" + masterTopic +
               '}';
    }
}
