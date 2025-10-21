package com.hn369.universeblog.dto.serialarticle;

public class SerialArticleReadResponseDto {
	private String serialArticleUuid;
	private String serialArticleName;
	private String languageCode;
	private String defaultLanguageCode;
	private String masterTopicUuid;
	private String masterTopicName;
	
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
	public String getLanguageCode() {
		return languageCode;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getDefaultLanguageCode() {
		return defaultLanguageCode;
	}
	public void setDefaultLanguageCode(String defaultLanguageCode) {
		this.defaultLanguageCode = defaultLanguageCode;
	}
	public String getMasterTopicUuid() {
		return masterTopicUuid;
	}
	public void setMasterTopicUuid(String masterTopicUuid) {
		this.masterTopicUuid = masterTopicUuid;
	}
	public String getMasterTopicName() {
		return masterTopicName;
	}
	public void setMasterTopicName(String masterTopicName) {
		this.masterTopicName = masterTopicName;
	}
	
	
	

}
