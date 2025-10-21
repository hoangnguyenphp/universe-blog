package com.hn369.universeblog.dto.topic;

public class TopicReadResponseDto {
	private String topicUuid;
	private String topicName;
	private String defaultLanguageCode;
	
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
	public String getDefaultLanguageCode() {
		return defaultLanguageCode;
	}
	public void setDefaultLanguageCode(String defaultLanguageCode) {
		this.defaultLanguageCode = defaultLanguageCode;
	}
}
