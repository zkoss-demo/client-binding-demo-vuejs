package org.zkoss.demo.forum.service;

import org.zkoss.demo.forum.entity.User;

/**
 * User register service.
 */
public interface UserService {
	/**
	 * Add a new user.
	 *
	 * @param account User account
	 * @param password User password
	 * @param name User name
	 * @return Whether adding is successful or not
	 */
	boolean addNewUser(String account, String password, String name);

	/**
	 * Get the user name.
	 *
	 * @param userId User ID
	 * @return User name
	 */
	String getName(int userId);
}
