package com.parser.Jnews.job;

import java.io.IOException;

import javax.lang.model.element.Element;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.parser.Jnews.Service.NewsService;

@Component
public class ParserTask {

	@Autowired
	NewsService newsService;
	
	@Scheduled(fixedDelay = 10000)
	public void parseNews() {
		String url = "https://news.ycombinator.com/";
		
		try {
			Document doc = Jsoup.connect(url)
					.userAgent("Mozilla")
					.timeout(5000)
					.referrer("https://google.com")
					.get();
			Element news = doc.getElementsByClass("storylink");
			for (Element el: news) {
				String title = el.ownText();
				if (!newsService.isExist(title)) {
					News obj = new News();
					obj.setTitle(title);
					newsService.save(obj);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}