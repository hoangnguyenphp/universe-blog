package com.hn369.universeblog.service.language;

import com.hn369.universeblog.service.entity.language.Language;

public interface LanguageRepositoryIfc {
	Language findByCode(String languageCode);
}
