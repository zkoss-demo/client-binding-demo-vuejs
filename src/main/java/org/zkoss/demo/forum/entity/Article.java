package org.zkoss.demo.forum.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Proxy(lazy = false)
@Table(name = "ARTICLES")
public class Article implements Serializable {
	private static final long serialVersionUID = 1L;

	public Article() {
	}

	//for demo
	public Article(int id, User userID, String subject, String thumbnail, String content, Date lastEditedTime, Date publishedTime) {
		this.uid = id;
		this.userID = userID;
		this.subject = subject;
		this.thumbnail = thumbnail;
		this.content = content;
		this.lastEditedTime = lastEditedTime;
		this.publishedTime = publishedTime;
	}

	@Id
	@GeneratedValue
	private int uid;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "userID")
	private User userID;

	private String subject;
	private String thumbnail;
	private String content;
	private Date lastEditedTime;
	private Date publishedTime;
	private Integer status;

	public Article(int uid) {
		this.uid = uid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public User getUserID() {
		return userID;
	}

	public void setUserID(User user_id) {
		this.userID = user_id;
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

	public Date getLastEditedTime() {
		return lastEditedTime;
	}

	public void setLastEditedTime(Date lastEditedTime) {
		this.lastEditedTime = lastEditedTime;
	}

	public Date getPublishedTime() {
		return publishedTime;
	}

	public void setPublishedTime(Date publishedTime) {
		this.publishedTime = publishedTime;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
