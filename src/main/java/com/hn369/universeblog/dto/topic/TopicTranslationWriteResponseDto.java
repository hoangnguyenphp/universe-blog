package com.hn369.universeblog.dto.topic;

public class TopicTranslationWriteResponseDto {
    private String topic_uuid;
    private String language;
    private String topicName;

    // Constructors
    public TopicTranslationWriteResponseDto() {
    }

    public TopicTranslationWriteResponseDto(String topic_uuid, String language, String topicName) {
        this.topic_uuid = topic_uuid;
        this.language = language;
        this.topicName = topicName;
    }

    // Getters and Setters
	public String getTopic_uuid() {
		return topic_uuid;
	}

	public void setTopic_uuid(String topic_uuid) {
		this.topic_uuid = topic_uuid;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
}
