package com.bmg.vault.user.group;

import com.bmg.vault.model.BasicModel;
import com.bmg.vault.user.User;


import java.util.ArrayList;
import java.util.List;

//@Entity
//@Table(name = "usergroup")
public class UserGroup extends BasicModel {


	public String name;

//	@ElementCollection
//	@JoinTable(name = "usergroup_permission")
	public List<String> permissions = new ArrayList<String>();

	//@ManyToMany(mappedBy = "groups")
	public List<User> users = new ArrayList<User>();

//	@ManyToMany
//	@JoinTable(name = "usergroup_list_filter")
//	public Set<ListFilter> listFilters = new LinkedHashSet<ListFilter>();

}
