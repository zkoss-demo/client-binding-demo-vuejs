package org.zkoss.demo.forum.entity;

import java.util.Date;

/**
 * @author jameschu
 */
public class Article {
	//for demo
	public Article(int id, User user, String subject, String thumbnail, String content, Date publishedTime) {
		this.uid = id;
		this.user = user;
		this.subject = subject;
		this.thumbnail = thumbnail;
		this.content = content;
		this.publishedTime = publishedTime;
	}

	private int uid;
	private User user;
	private String subject;
	private String thumbnail;
	private String content;
	private Date publishedTime;

	public Article(int uid) {
		this.uid = uid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getPublishedTime() {
		return publishedTime;
	}

	public void setPublishedTime(Date publishedTime) {
		this.publishedTime = publishedTime;
	}
}
