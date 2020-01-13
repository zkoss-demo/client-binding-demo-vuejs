/* StaticArticleServiceImpl.java
	Purpose:

	Description:

	History:
		Thu Jan 02 17:47:04 CST 2020, Created by jameschu

Copyright (C) 2020 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.demo.forum.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.zkoss.demo.forum.entity.Article;
import org.zkoss.demo.forum.service.ArticleService;

/**
 * @author jameschu
 */
public class StaticArticleServiceImpl implements ArticleService {
	public static List<Article> articles;

	static {
		String content = "<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin facilisis nibh leo, rhoncus commodo ligula blandit ut. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Etiam fringilla lacinia quam eget tincidunt. Fusce non dapibus leo, at eleifend augue. Cras condimentum tincidunt neque, efficitur porttitor tellus porttitor at. Donec et sem vitae arcu facilisis sollicitudin. Praesent non euismod erat, in mattis felis. Sed gravida orci quis ligula malesuada, vitae blandit neque suscipit. Cras consequat urna sit amet turpis venenatis, sed ultricies nisl efficitur.</p><p>Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Donec tincidunt ultrices congue. Curabitur at libero fermentum, dictum libero nec, gravida ante. Mauris sagittis sed nisi eu tincidunt. In suscipit eros sapien, non eleifend lorem posuere a. Duis aliquet, nibh non lacinia egestas, massa ex ultricies libero, eu rutrum metus risus vitae lacus. Aliquam lobortis varius nisi non dignissim. Praesent eget mauris sagittis, fermentum arcu at, lacinia augue. Nam et dolor a tortor egestas egestas.</p><p>Mauris tristique tortor nec bibendum pretium. Vivamus fringilla justo quis malesuada scelerisque. Proin ac condimentum lectus, id rutrum nisl. Mauris luctus metus ex, vel molestie arcu hendrerit id. Fusce laoreet ipsum a auctor maximus. Proin varius condimentum venenatis. Nam sed risus ligula. Proin id blandit sem.</p>";
		articles = new ArrayList<Article>(Arrays.asList(new Article[] {
				new Article(0, StaticUserServiceImpl.users.get(0), "First Article",
						"/img/thumbnails/fallon-michael-kx7Ou-9xy0E-unsplash.jpg",
						content, new Date(), new Date()),
				new Article(1, StaticUserServiceImpl.users.get(0), "Second Article",
						"/img/thumbnails/hussain-faruhaan-XOEL0hNDub0-unsplash.jpg",
						content, new Date(), new Date()),
				new Article(2, StaticUserServiceImpl.users.get(1), "Third Article",
						"/img/thumbnails/motoki-tonn-vV1a1Leq-dQ-unsplash.jpg",
						content, new Date(), new Date()),
				new Article(3, StaticUserServiceImpl.users.get(1), "Fourth Article",
						"/img/thumbnails/patrick-hendry-A9tqKShumpM-unsplash.jpg",
						content, new Date(), new Date()),
				new Article(4, StaticUserServiceImpl.users.get(2), "Fifth Article",
						"/img/thumbnails/person-climbing-staircase-between-escalators-3429166.jpg",
						content, new Date(), new Date()),
				new Article(5, StaticUserServiceImpl.users.get(2), "Sixth Article",
						"/img/thumbnails/thomas-bonometti-mx6BzzKvWIw-unsplash.jpg",
						content, new Date(), new Date()), }));
	}

	@Override
	public List<Article> getRecent10Articles() {
		return articles;
	}

	@Override
	public void addNewArticle(int userId, String title, String content, Date timestamp) {

	}

	@Override
	public Article getById(int id) {
		for (Article article : this.articles) {
			if (id == article.getUid())
				return article;
		}
		return null;
	}

	@Override
	public void editArticle(int articleId, String title, String content) {

	}

	@Override
	public void deleteArticle(int articleId) {

	}
}
