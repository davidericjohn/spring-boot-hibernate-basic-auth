package com.ph.eric.eruditionws.service;

import com.ph.eric.eruditionws.to.UserTO;

/**
 * Registration Service
 * 
 * @author davidericjohn
 * @since 1.0.0
 */
public interface RegisterService {
	
	/**
	 * Saves user data
	 * 
	 * @param user
	 */
	public void saveUser(UserTO user);

}