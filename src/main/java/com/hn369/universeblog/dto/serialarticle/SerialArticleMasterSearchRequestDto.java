package com.hn369.universeblog.dto.serialarticle;

public class SerialArticleMasterSearchRequestDto {
    private String serialArticleName;
    private String topicName;
    private String defaultLanguageCode;
    private int page = 0;
    private int size = 10;
    private int offset;
	public String getSerialArticleName() {
		return serialArticleName;
	}
	public void setSerialArticleName(String serialArticleName) {
		this.serialArticleName = serialArticleName;
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
