package com.hn369.universeblog.service.entity.serialarticle;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "serial_article_translation")
public class SerialArticleTranslation {

	@EmbeddedId
	private SerialArticleTranslationId id;

	@Column(name = "serial_article_name", length = 255)
	private String serialArticleName;

	// --- Constructors ---
	public SerialArticleTranslation() {
	}

	public SerialArticleTranslation(SerialArticleTranslationId id) {
		this.id = id;
	}

	// --- Getters and Setters ---
	public SerialArticleTranslationId getId() {
		return id;
	}

	public void setId(SerialArticleTranslationId id) {
		this.id = id;
	}

	public String getSerialArticleName() {
		return serialArticleName;
	}

	public void setSerialArticleName(String serialArticleName) {
		this.serialArticleName = serialArticleName;
	}
}
