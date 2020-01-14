package org.zkoss.demo.forum.entity;

/**
 * @author jameschu
 */
public class User {
	public User(int uid, String account, String password, String name) {
		this.uid = uid;
		this.account = account;
		this.password = password;
		this.name = name;
	}

	private int uid;
	private String account;
	private String password;
	private String name;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
