package com.hn369.universeblog.infra.repository.mybatis.topic;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hn369.universeblog.dto.topic.TopicByLanguageReadResponseDto;

@Mapper
public interface TopicMyBatisMapper {
    List<TopicByLanguageReadResponseDto> findAllTopicsByLanguageCode(@Param("languageCode") String languageCode);
}
