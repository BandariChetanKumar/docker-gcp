package com.bmg.vault.user.settings;

import com.bmg.vault.model.BasicModel;
import com.bmg.vault.user.User;

/**
 * Container object for user specific settings, like most recently used lists and whatnot.
 * 
 *
 */
//@Entity
//@Table(name = "user_settings")
public class UserSettings extends BasicModel {
	
//	@OneToOne
	User user;
	
	public UserSettings(User user) {
		this.user = user;
	}
	
	private static int RECENT_LISTS_DEFAULT_SIZE = 5;
	
//	@ManyToMany
//	@JoinTable(name = "user_settings_recent_lists")
//	public java.util.List<List> recentLists = new LinkedList<List>();


	
}
