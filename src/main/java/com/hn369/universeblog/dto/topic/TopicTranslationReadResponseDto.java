package com.hn369.universeblog.dto.topic;

public class TopicTranslationReadResponseDto {
	private String topicUuid;
    private String topicName;
    private String languageCode;
    
	public TopicTranslationReadResponseDto() {
	}
	
	public TopicTranslationReadResponseDto(String topicUuid, String topicName, String languageCode,
			String languageName) {
		super();
		this.topicUuid = topicUuid;
		this.topicName = topicName;
		this.languageCode = languageCode;
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
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
