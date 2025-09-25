package com.hn369.universeblog.dto.article;

public class SerialArticleReadResponseDto {
	private String serialArticleUuid;
	private String serialArticleName;
	private String languageCode;
	
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
	
	

}
