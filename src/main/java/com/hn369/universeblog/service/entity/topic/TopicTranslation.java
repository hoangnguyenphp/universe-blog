package com.hn369.universeblog.service.entity.topic;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.Table;

@Entity
@Table(name = "topic_translation")
@IdClass(TopicTranslationId.class)
public class TopicTranslation {
	@Id
	@Column(name = "topic_uuid", length = 100, nullable = false)
	private String topicUuid;

	@Id
	@Column(name = "language_code", length = 50, nullable = false)
	private String languageCode;

	@Column(name = "topic_name", length = 255)
	private String topicName;

	// Constructors
	public TopicTranslation() {
	}

	public TopicTranslation(String topicUuid, String languageCode, String topicName) {
		super();
		this.topicUuid = topicUuid;
		this.languageCode = languageCode;
		this.topicName = topicName;
	}



	public String getTopicUuid() {
		return topicUuid;
	}



	public void setTopicUuid(String topicUuid) {
		this.topicUuid = topicUuid;
	}



	public String getLanguageCode() {
		return languageCode;
	}



	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}



	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}

}
