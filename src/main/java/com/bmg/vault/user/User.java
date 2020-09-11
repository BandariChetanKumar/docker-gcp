package com.bmg.vault.user;

import com.bmg.vault.model.BasicModel;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity
//@Table(name = "user")
@Data
@NoArgsConstructor
public class User extends BasicModel {

	/*private String apiKey;

	private int logins = 0;
	private Date lastLogin;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private UserSettings userSettings;

	@OneToMany(mappedBy = "user")
	private List<Template> searchTemplates = new ArrayList<Template>();

	@ManyToMany
	@JoinTable(name = "user_usergroup")
	private Set<UserGroup> groups = new HashSet<UserGroup>();

	@OneToMany(mappedBy = "creator")
	private List<Item> items = new ArrayList<Item>();

	@OneToMany(mappedBy = "creator")
	private List<ItemVersion> itemVersions = new ArrayList<ItemVersion>();*/


}
