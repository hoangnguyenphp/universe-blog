package com.hn369.universeblog.dto.articletranslation;

public class ArticleTranslationCreationResquestDto {
	private String articleTranslationMasterUuid;
	
	private String languageCode;
	
    private String articleName;
    
    private String articleContent;
    
    private String serialArticleUuid;
    
    private Integer chapterId;
    
	public String getArticleTranslationMasterUuid() {
		return articleTranslationMasterUuid;
	}

	public void setArticleTranslationMasterUuid(String articleTranslationMasterUuid) {
		this.articleTranslationMasterUuid = articleTranslationMasterUuid;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getArticleName() {
		return articleName;
	}

	public void setArticleName(String articleName) {
		this.articleName = articleName;
	}

	public String getArticleContent() {
		return articleContent;
	}

	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}

	public String getSerialArticleUuid() {
		return serialArticleUuid;
	}

	public void setSerialArticleUuid(String serialArticleUuid) {
		this.serialArticleUuid = serialArticleUuid;
	}

	public Integer getChapterId() {
		return chapterId;
	}

	public void setChapterId(Integer chapterId) {
		this.chapterId = chapterId;
	}
}
