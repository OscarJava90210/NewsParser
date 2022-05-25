package com.parser.Jnews.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.parser.Jnews.model.News;

@Service
public interface NewsService {
	public void save(String news);
	public boolean isExist(String newsTitle);
	public List<News>getAllNews();

}
