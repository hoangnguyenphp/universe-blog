package com.hn369.universeblog.dto.serialarticle;

public class SerialArticleMasterSearchResponseDto {
    private String serialArticleUuid;
    private String serialArticleName;
    private String defaultLanguageCode;
    private String topicUuid;
    private String topicName;
	public String getSerialArticleUuid() {
		return serialArticleUuid;
	}
	public void setSerialArticleUuid(String serialArticleUuid) {
		this.serialArticleUuid = serialArticleUuid;
	}
	public String getSerialArticleName() {
		return serialArticleName;
	}
	public void setSerialArticleName(String serialArticleName) {
		this.serialArticleName = serialArticleName;
	}
	public String getDefaultLanguageCode() {
		return defaultLanguageCode;
	}
	public void setDefaultLanguageCode(String defaultLanguageCode) {
		this.defaultLanguageCode = defaultLanguageCode;
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
}
