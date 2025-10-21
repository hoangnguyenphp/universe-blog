package com.hn369.universeblog.service.serialarticle;

import java.util.List;

import com.hn369.universeblog.dto.serialarticle.SerialArticleReadResponseDto;
import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;

public interface SerialArticleRepositoryIfc {
	SerialArticle findByUuid(String uuid);
	
	List<SerialArticleReadResponseDto> findSerialArticleByMasterTopicUuidAndLanguage(String masterTopicUuid, String languageCode);
	
	SerialArticleReadResponseDto findSerialArticleByUuidAndLanguage(String serialArticleUuid, String languageCode);
	
	List<SerialArticleReadResponseDto> findAllSerialArticles();
}
