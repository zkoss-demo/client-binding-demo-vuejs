package org.zkoss.demo.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@Controller
public class ForumApplication {
	public static void main(String[] args) {
		SpringApplication.run(ForumApplication.class, args);
	}
	@GetMapping("/articles")
	public String articles() {
		return "articles";
	}
	@GetMapping("/article-view")
	public String articleView() {
		return "article-view";
	}
}
