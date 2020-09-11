package com.bmg.vault.list;


import com.bmg.vault.user.group.UserGroup;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "list")
@Data
@Getter
@Setter
public class VaultList {//extends BasicModel /*implements Indexable*/{


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	private String name;

	@Transient
	private String style = "default";

	@Transient
	private boolean fieldsChanged = false;

//	@Lob
	@Transient
	private String description;

//	@Lob
@Transient
	private String formHint;

//	@Column(unique = true, nullable = false)
//	@Required
//	@Match(value = "[a-zA-Z0-9]*", message = "The UID must only contain alphanumeric characters.")
//	@Unique
	private String uid;
//
//	@Required
//	@ManyToOne(optional = false)
//	private Section section;
	
	//@ManyToMany
	//@JoinTable(name = "list_usergroup")
	//private Set<UserGroup> groups = new HashSet<UserGroup>();
	
//	@ManyToMany
//	@JoinTable(name = "list_permission_user")
//	private Set<UserPermission> userPermissions = new HashSet<UserPermission>();
	
//	@ManyToMany
//	@JoinTable(name = "list_permission_usergroup")
//	private Set<UserGroupPermission> userGroupPermissions = new HashSet<UserGroupPermission>();

	@Transient
	private java.util.List<UserGroup> newGroups;

	//@OneToMany(mappedBy = "list")
//	private java.util.List<Template> searchTemplates = new ArrayList<Template>();

	//@OneToMany(mappedBy = "list")
//	private java.util.List<ListFilter> filters = new ArrayList<ListFilter>();

	//@OneToMany(mappedBy = "list", cascade = CascadeType.ALL)
//	private java.util.List<Item> items = new ArrayList<Item>();

//	@OneToMany(mappedBy = "list", cascade = CascadeType.ALL)
//	@OrderBy("rank ASC, id ASC")
//	private java.util.List<Field> fields = new ArrayList<Field>();


	@Transient
	private boolean enableRelations = true;







}
