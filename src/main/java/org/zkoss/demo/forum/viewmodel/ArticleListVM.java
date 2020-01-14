package org.zkoss.demo.forum.viewmodel;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.bind.annotation.NotifyCommand;
import org.zkoss.bind.annotation.NotifyCommands;
import org.zkoss.bind.annotation.ToClientCommand;
import org.zkoss.bind.annotation.ToServerCommand;
import org.zkoss.demo.forum.entity.Article;
import org.zkoss.demo.forum.service.ArticleService;
import org.zkoss.demo.forum.service.impl.StaticArticleServiceImpl;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zul.Window;

@NotifyCommands({ @NotifyCommand(value = "toC_Articles", onChange = "_vm_.articles")})
@ToClientCommand({ "toC_Articles"})
@ToServerCommand({ "loadArticles", "loadArticleById"})
public class ArticleListVM {
	private static final Logger log = LoggerFactory.getLogger(ArticleListVM.class.getName());
	private List<Article> articles;

	/* Data Access Object */
	ArticleService articleService = new StaticArticleServiceImpl();

	@Init
	public void init() {
		log.info("ArticleListVM Load : " + Executions.getCurrent().getContextPath());
	}

	@Command
	@NotifyChange("articles")
	public void loadArticles() {
		articles = articleService.getRecentArticles();
	}

	@Command
	@NotifyChange("currentArticle")
	public void loadArticleById(@BindingParam("aid") int uid) {
		Executions.getCurrent().getSession().setAttribute("currentArticleId", uid);
		Window window = (Window)Executions.createComponents("~./zul/article-view.zul", null, null);
		window.doModal();
	}

	public List<Article> getArticles() {
		return articles;
	}

}
