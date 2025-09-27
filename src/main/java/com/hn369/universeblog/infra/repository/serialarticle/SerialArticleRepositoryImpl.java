package com.hn369.universeblog.infra.repository.serialarticle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.dto.serialarticle.SerialArticleReadResponseDto;
import com.hn369.universeblog.service.entity.serialarticle.SerialArticle;
import com.hn369.universeblog.service.serialarticle.SerialArticleRepositoryIfc;

@Repository
public class SerialArticleRepositoryImpl implements SerialArticleRepositoryIfc {
	
	@Autowired
	private SerialArticleMyBatisMapper serialArticleMyBatisMapper;
	
	@Autowired
	private SerialArticleJpaRespository serialArticleJpaRespository;

	@Override
	public SerialArticle findByUuid(String uuid) {
		SerialArticle serialArticle = serialArticleJpaRespository.findByUuid(uuid);
		return serialArticle;
	}

	@Override
	public List<SerialArticleReadResponseDto> findSerialArticleByMasterTopicUuidAndLanguage(String masterTopicUuid,
			String languageCode) {
		List<SerialArticleReadResponseDto> serialArticleList = serialArticleMyBatisMapper.findSerialArticleByMasterTopicUuidAndLanguage(masterTopicUuid, languageCode);
		return serialArticleList;
	}

	@Override
	public SerialArticleReadResponseDto findSerialArticleByUuidAndLanguage(String serialArticleUuid, String languageCode) {
		SerialArticleReadResponseDto serialArticle = serialArticleMyBatisMapper.findSerialArticleByUuidAndLanguage(serialArticleUuid, languageCode);
		return serialArticle;
	}

}
