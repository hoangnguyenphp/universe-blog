package com.hn369.universeblog.repository.topic;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.entity.topic.Topic;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {

}
