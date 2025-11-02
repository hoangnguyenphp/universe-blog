package com.hn369.universeblog.dto.articletranslation;

public class ArticleTranslationUpdateRequestDto {
	private String articleUuid;
	
	private String languageCode;
	
    private String articleName;
    
    private String articleContent;

	public String getArticleName() {
		return articleName;
	}
	
	public String getArticleUuid() {
		return articleUuid;
	}

	public void setArticleUuid(String articleUuid) {
		this.articleUuid = articleUuid;
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

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
}
