package org.zkoss.demo.forum.service;

/**
 * @author jameschu
 */
public interface UserService {

	/**
	 * Get the user name.
	 *
	 * @param userId User ID
	 * @return User name
	 */
	String getName(int userId);
}
