package com.hn369.universeblog.infra.repository.language;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hn369.universeblog.service.entity.language.Language;

@Repository
public interface LanguageJpaRepository extends CrudRepository<Language, Long>{
	
	public Language findByCode(String languageCode);

}
