package com.hn369.universeblog.entity.topic;

import com.hn369.universeblog.entity.language.Language;

import jakarta.persistence.*;

@Entity
@Table(name = "topic")
public class Topic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "topic_id")
    private Long topicId;

    @Column(name = "topic_uuid", nullable = false, unique = true, length = 100)
    private String topicUuid;

    @Column(name = "topic_name", length = 255)
    private String topicName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "default_language_code", referencedColumnName = "language_code")
    private Language defaultLanguage;

    // --- Constructors ---
    public Topic() {}

    public Topic(String topicUuid, String topicName, Language defaultLanguage) {
        this.topicUuid = topicUuid;
        this.topicName = topicName;
        this.defaultLanguage = defaultLanguage;
    }

    // --- Getters and Setters ---
    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
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

    public Language getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(Language defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }
}

