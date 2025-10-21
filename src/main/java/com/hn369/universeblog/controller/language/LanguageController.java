package com.hn369.universeblog.controller.language;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hn369.universeblog.dto.language.LanguageReadResponseDto;
import com.hn369.universeblog.service.language.LanguageService;

@RestController
public class LanguageController {
	@Autowired
	private LanguageService languageService;
	
	@GetMapping("/languages")
	public ResponseEntity<List<LanguageReadResponseDto>> getAllLanguage() {
		List<LanguageReadResponseDto> languageResponseList = languageService.getAllLanguages();
		return ResponseEntity.ok(languageResponseList);
	}
}
