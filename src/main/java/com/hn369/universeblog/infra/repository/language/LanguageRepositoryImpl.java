package com.hn369.universeblog.infra.repository.language;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.language.Language;
import com.hn369.universeblog.service.language.LanguageRepositoryIfc;

@Repository
public class LanguageRepositoryImpl implements LanguageRepositoryIfc {
	
	@Autowired
	private LanguageJpaRepository languageJpaRepository;

	@Override
	public Language findByCode(String languageCode) {
		Language language = languageJpaRepository.findByCode(languageCode);
		return language;
	}

}
