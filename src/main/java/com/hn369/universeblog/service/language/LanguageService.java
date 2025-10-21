package com.hn369.universeblog.service.language;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.dto.language.LanguageReadResponseDto;
import com.hn369.universeblog.infra.repository.language.LanguageJpaRepository;
import com.hn369.universeblog.service.entity.language.Language;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageJpaRepository languageRepository;
	
	public Language retrieveByLanguageCode(String languageCode) {
		return languageRepository.findByCode(languageCode);
	}
	
	public List<LanguageReadResponseDto> getAllLanguages() {
		List<Language> languageList = languageRepository.findAll();
		List<LanguageReadResponseDto> languageResponseList = new ArrayList<>();
		for(Language language : languageList) {
			languageResponseList.add(languageMapper(language));
		}
		return languageResponseList;
	}
	
	private LanguageReadResponseDto languageMapper(Language language) {
		LanguageReadResponseDto languageReadResponseDto = new LanguageReadResponseDto();
		languageReadResponseDto.setLanguageId(language.getId());
		languageReadResponseDto.setLanguageCode(language.getCode());
		languageReadResponseDto.setLanguageName(language.getName());
		return languageReadResponseDto;
	}
}
