package com.bmg.vault.search.template;

import com.bmg.vault.list.VaultList;
import com.bmg.vault.model.BasicModel;
import com.bmg.vault.user.User;

//@Entity
//@Table(name = "search_template")
public class Template extends BasicModel {


	public String name;

	public boolean publicly = false;

//	@ManyToOne(optional = false)
	public User user;

//	@ManyToOne(optional = false)
	public VaultList vaultList;

//	@Lob
	public String search;

//	public static java.util.List<Template> findByList(List list) {
//		return find("list = ?", list).fetch();
//	}
}
