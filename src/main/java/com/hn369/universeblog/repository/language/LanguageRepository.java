package com.hn369.universeblog.repository.language;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.entity.language.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{
	
	public Language findByCode(String languageCode);

}
