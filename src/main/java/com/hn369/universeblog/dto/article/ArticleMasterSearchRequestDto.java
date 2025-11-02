package com.hn369.universeblog.dto.article;

public class ArticleMasterSearchRequestDto {
    private String articleName;
    private String topicName;
    private String createdUser;
    private String defaultLanguageCode;
    private String dateCreatedFrom; // e.g. "2025-01-01"
    private String dateCreatedTo;   // e.g. "2025-12-31"
    private Boolean isSerialArticle;

    private int page = 0;  // default page index
    private int size = 10; // default page size
    private int offset;
    
	public String getArticleName() {
		return articleName;
	}
	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getDefaultLanguageCode() {
		return defaultLanguageCode;
	}
	public void setDefaultLanguageCode(String defaultLanguageCode) {
		this.defaultLanguageCode = defaultLanguageCode;
	}
	public String getDateCreatedFrom() {
		return dateCreatedFrom;
	}
	public void setDateCreatedFrom(String dateCreatedFrom) {
		this.dateCreatedFrom = dateCreatedFrom;
	}
	public String getDateCreatedTo() {
		return dateCreatedTo;
	}
	public void setDateCreatedTo(String dateCreatedTo) {
		this.dateCreatedTo = dateCreatedTo;
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
	public Boolean getIsSerialArticle() {
		return isSerialArticle;
	}
	public void setIsSerialArticle(Boolean isSerialArticle) {
		this.isSerialArticle = isSerialArticle;
	}
	public int getOffset() {
		return offset;
	}
	public void setOffset(int offset) {
		this.offset = offset;
	}
}
