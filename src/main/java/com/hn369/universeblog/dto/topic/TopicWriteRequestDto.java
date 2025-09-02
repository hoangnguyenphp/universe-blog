package com.hn369.universeblog.dto.topic;

public class TopicWriteRequestDto {
    private Long topicId;

    private String topicName;

    private String defaultLanguage;

    // --- Constructors ---
    public TopicWriteRequestDto() {}

    public TopicWriteRequestDto(String topicName, String defaultLanguage) {
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

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }
}
