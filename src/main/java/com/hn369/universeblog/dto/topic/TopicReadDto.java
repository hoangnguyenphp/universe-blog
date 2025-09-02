package com.hn369.universeblog.dto.topic;

public class TopicReadDto {

    private Long topicId;

    private String topicUuid;

    private String topicName;

    private String defaultLanguage;

    // --- Constructors ---
    public TopicReadDto() {}

    public TopicReadDto(String topicUuid, String topicName, String defaultLanguage) {
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

    public String getDefaultLanguage() {
        return defaultLanguage;
    }

    public void setDefaultLanguage(String defaultLanguage) {
        this.defaultLanguage = defaultLanguage;
    }

}
