package com.hn369.universeblog.service.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.infra.repository.language.LanguageJpaRepository;
import com.hn369.universeblog.service.entity.language.Language;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageJpaRepository languageRepository;
	
	public Language retriveByLanguageCode(String languageCode) {
		return languageRepository.findByCode(languageCode);
	}

}
