package com.parser.Jnews.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.parser.Jnews.Service.NewsService;
import com.parser.Jnews.model.News;

@RestController
public class NewsController {
	
	@Autowired
	NewsService newsService;
	
	@GetMapping(value = "/news")
	public List<News> getNews() {
		return newsService.getAllNews();
	}
}