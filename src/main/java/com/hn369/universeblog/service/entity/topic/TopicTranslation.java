package com.hn369.universeblog.service.entity.topic;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "topic_translation")
public class TopicTranslation {

    @EmbeddedId
    private TopicTranslationId id;

    @Column(name = "topic_name", length = 255)
    private String topicName;

    // Constructors
    public TopicTranslation() {
    }
    
   	public TopicTranslation(TopicTranslationId id, String topicName) {
		super();
		this.id = id;
		this.topicName = topicName;
	}

	public TopicTranslationId getId() {
		return id;
	}

	public void setId(TopicTranslationId id) {
		this.id = id;
	}

	public String getTopicName() {
		return topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}    
    
}
