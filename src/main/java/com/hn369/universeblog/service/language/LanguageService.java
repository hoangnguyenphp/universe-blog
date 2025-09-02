package com.hn369.universeblog.service.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hn369.universeblog.entity.language.Language;
import com.hn369.universeblog.repository.language.LanguageRepository;

@Service
public class LanguageService {
	
	@Autowired
	private LanguageRepository languageRepository;
	
	public Language retriveByLanguageCode(String languageCode) {
		return languageRepository.findByCode(languageCode);
	}

}
