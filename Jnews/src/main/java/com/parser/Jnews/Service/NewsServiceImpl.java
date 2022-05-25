package com.parser.Jnews.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.parser.Jnews.model.News;
import com.parser.Jnews.repository.NewsRepository;




@Service
public class NewsServiceImpl implements NewsService {
	
	@Autowired
	NewsRepository repository;

	@Override
	public void save(News news) {
		repository.save(news);
	}

	@Override
	public boolean isExist(String newsTitle) {
		List<News> allNews = repository.findAll();
		for (News n: allNews) {
			if (n.getTitle().equals(newsTitle)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<News> getAllNews() {
		return repository.findAll();
	}

	@Override
	public void save(String news) {
		// TODO Auto-generated method stub
		
	}

}