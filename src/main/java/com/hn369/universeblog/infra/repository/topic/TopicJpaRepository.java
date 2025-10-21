package com.hn369.universeblog.infra.repository.topic;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.topic.Topic;

@Repository
public interface TopicJpaRepository extends CrudRepository<Topic, Long> {
	Topic findByTopicUuid(String topicUuid);
	List<Topic> findAll();

}
