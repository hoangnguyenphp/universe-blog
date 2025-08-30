package com.hn369.universeblog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
	
	@GetMapping("/helloworld")
	public String helloWorld() {
		return "Hello World!";
	}

}
