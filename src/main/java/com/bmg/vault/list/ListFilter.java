package com.bmg.vault.list;



import com.bmg.vault.model.BasicModel;

//@Entity
//@Table(name = "list_filter")
public class ListFilter extends BasicModel {

	/*@Required
	public String name;

	@ManyToOne(optional = false)
	public models.data.List list;

	public boolean isAnd = true;

	@ElementCollection
	@JoinTable(name = "list_filter_param")
	@Required
	public Map<String, String> searchParams = new HashMap<String, String>();

	@ManyToMany(mappedBy = "listFilters")
	public Set<UserGroup> groups = new LinkedHashSet<UserGroup>();

	@Transient
	public java.util.List<UserGroup> newGroups;

	public boolean isAffected(User user) {
		for (UserGroup group : groups) {
			if (group.users.contains(user)) {
				return true;
			}
		}
		return false;
	}

	public static java.util.List<models.data.ListFilter> findByList(models.data.List list) {
		return find("list = ?", list).fetch();
	}

	@Override
	public void _delete() {
		for (UserGroup group : groups) {
			group.listFilters.remove(this);
			group.willBeSaved = true;
		}

		super._delete();
	}
	
	@Override
	public void _save() {
		if (newGroups != null) {
			for (UserGroup group : groups) {
				group.listFilters.remove(this);
				group.willBeSaved = true;
			}
			for (UserGroup group : newGroups) {
				group.listFilters.add(this);
				group.willBeSaved = true;
			}
		}

		super._save();
	}*/
}