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
import java.util.Set;

import org.zkoss.demo.forum.entity.Article;
import org.zkoss.demo.forum.entity.User;
import org.zkoss.demo.forum.service.ArticleService;
import org.zkoss.demo.forum.service.UserService;

/**
 * @author jameschu
 */
public class StaticUserServiceImpl implements UserService {
	public static List<User> users;

	static {
		users = new ArrayList<User>(Arrays.asList(new User[]{
				new User(0, "James", "123", "James"),
				new User(1, "Amber", "123", "Amber"),
				new User(2, "Sam", "123", "Sam"),
		}));
	}

	@Override
	public boolean addNewUser(String account, String password, String name) {
		return false;
	}

	@Override
	public String getName(int userId) {
		for (User user : this.users) {
			if (userId == user.getUid())
				return user.getName();
		}
		return null;
	}
}

