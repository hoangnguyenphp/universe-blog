package com.hn369.universeblog.dto.topic;

public class TopicByLanguageReadResponseDto {
	private String topicUuid;
    private String topicName;
    private String languageCode;
    private String languageName;
    
    public TopicByLanguageReadResponseDto() {};
    
	public TopicByLanguageReadResponseDto(String topicUuid, String topicName, String languageCode, String languageName) {
		super();
		this.topicUuid = topicUuid;
		this.topicName = topicName;
		this.languageCode = languageCode;
		this.languageName = languageName;
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
	public String getLanguageName() {
		return languageName;
	}
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}
    
    
    
}
