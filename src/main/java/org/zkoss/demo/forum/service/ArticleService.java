package org.zkoss.demo.forum.service;

import java.util.List;

import org.zkoss.demo.forum.entity.Article;

/**
 * Article related service.
 */
public interface ArticleService {
	/**
	 * Get the most recent articles.
	 *
	 * @return Articles
	 */
	List<Article> getRecentArticles();

	/**
	 * Get the specific article.
	 *
	 * @param id Article ID
	 * @return Specific Article. May be null
	 */
	Article getById(int id);
}
