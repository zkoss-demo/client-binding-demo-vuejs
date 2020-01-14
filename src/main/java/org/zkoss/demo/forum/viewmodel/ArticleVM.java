package org.zkoss.demo.forum.viewmodel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.zkoss.bind.annotation.Init;
import org.zkoss.demo.forum.entity.Article;
import org.zkoss.demo.forum.service.ArticleService;
import org.zkoss.demo.forum.service.impl.StaticArticleServiceImpl;
import org.zkoss.zk.ui.Executions;

public class ArticleVM {
	private static final Logger log = LoggerFactory.getLogger(ArticleVM.class.getName());
	private Article currentArticle;

	/* Data Access Object */
	ArticleService articleService = new StaticArticleServiceImpl();

	@Init
	public void init() {
		currentArticle = articleService
				.getById((Integer) Executions.getCurrent().getSession().getAttribute("currentArticleId"));
		log.info("ArticleVM Load : " + Executions.getCurrent().getContextPath());
	}

	public Article getCurrentArticle() {
		return currentArticle;
	}
}
