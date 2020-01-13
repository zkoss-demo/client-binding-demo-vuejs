package org.zkoss.demo.forum.service;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.zkoss.demo.forum.entity.Article;

/**
 * Article related service.
 */
public interface ArticleService {
	/**
	 * Get the most recent 10 articles.
	 *
	 * @return Articles
	 */
	List<Article> getRecent10Articles();

	/**
	 * Add a new article.
	 *
	 * @param userId User ID
	 * @param title Article title
	 * @param content Article content
	 * @param timestamp Article timestamp
	 */
	void addNewArticle(int userId, String title, String content, Date timestamp);

	/**
	 * Get the specific article.
	 *
	 * @param id Article ID
	 * @return Specific Article. May be null
	 */
	Article getById(int id);

	/**
	 * Edit article.
	 *
	 * @param articleId Article ID
	 * @param title New title
	 * @param content New content
	 */
	void editArticle(int articleId, String title, String content);

	/**
	 * Delete the specific article with replies tree.
	 *
	 * @param articleId Article ID
	 */
	void deleteArticle(int articleId);
}
