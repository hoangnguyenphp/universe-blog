package com.hn369.universeblog.service.language;

import java.util.List;

import com.hn369.universeblog.service.entity.language.Language;

public interface LanguageRepositoryIfc {
	Language findByCode(String languageCode);
	List<Language> findAll();
}
