package com.hn369.universeblog.service.serialarticle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.serialarticle.SerialArticleMasterSearchRequestDto;
import com.hn369.universeblog.dto.serialarticle.SerialArticleMasterSearchResponseDto;
import com.hn369.universeblog.dto.serialarticle.SerialArticleReadResponseDto;

@Service
public class SerialArticleService {
	
	@Autowired
	private SerialArticleRepositoryIfc serialArticleRepository;
	
	public List<SerialArticleReadResponseDto> retrieveSerialArticleByMasterTopicAndLanguage(String masterTopicUuid, String languageCode) {
		List<SerialArticleReadResponseDto> serialArticleList = serialArticleRepository.findSerialArticleByMasterTopicUuidAndLanguage(masterTopicUuid, languageCode);
		return serialArticleList;
	}
	
	public SerialArticleReadResponseDto findSerialArticleByUuidAndLanguage(String serialArticleUuid, String languageCode) {
		SerialArticleReadResponseDto serialArticle = serialArticleRepository.findSerialArticleByUuidAndLanguage(serialArticleUuid, languageCode);
		return serialArticle;
	}
	
	public List<SerialArticleReadResponseDto> retrieveAllSerialArticles() {
		List<SerialArticleReadResponseDto> serialArticleList = serialArticleRepository.findAllSerialArticles();
		return serialArticleList;
	}
	
	public List<SerialArticleMasterSearchResponseDto> searchSerialArticleMaster(
			SerialArticleMasterSearchRequestDto searchRequestDto) {
		searchRequestDto.setOffset(searchRequestDto.getPage() * searchRequestDto.getSize());
		List<SerialArticleMasterSearchResponseDto> serialArticles = serialArticleRepository.searchSerialArticleMaster(searchRequestDto);
		return serialArticles;
		
	}

}
