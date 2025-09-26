package com.hn369.universeblog.service.serialarticle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.serialarticle.SerialArticleReadResponseDto;

@Service
public class SerialArticleService {
	
	@Autowired
	private SerialArticleRepositoryIfc serialArticleRepository;
	
	public List<SerialArticleReadResponseDto> retrieveSerialArticleByMasterTopicAndLanguage(String masterTopicUuid, String languageCode) {
		List<SerialArticleReadResponseDto> serialArticleList = serialArticleRepository.findSerialArticleByMasterTopicUuidAndLanguage(masterTopicUuid, languageCode);
		return serialArticleList;
	}

}
