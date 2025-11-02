package com.hn369.universeblog.infra.repository.serialarticle;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.hn369.universeblog.dto.serialarticle.SerialArticleMasterSearchRequestDto;
import com.hn369.universeblog.dto.serialarticle.SerialArticleMasterSearchResponseDto;
import com.hn369.universeblog.dto.serialarticle.SerialArticleReadResponseDto;

@Mapper
public interface SerialArticleMyBatisMapper {
	List<SerialArticleReadResponseDto> findSerialArticleByMasterTopicUuidAndLanguage(@Param("masterTopicUuid") String masterTopicUuid, @Param("languageCode") String languageCode);
	SerialArticleReadResponseDto findSerialArticleByUuidAndLanguage(@Param("serialArticleUuid") String serialArticleUuid, @Param("languageCode") String languageCode);
	List<SerialArticleReadResponseDto> findAllSerialArticles();
	List<SerialArticleMasterSearchResponseDto> searchSerialArticleMaster(SerialArticleMasterSearchRequestDto searchRequestDto);
}
