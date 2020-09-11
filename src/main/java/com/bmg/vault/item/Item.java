package com.bmg.vault.item;

import com.bmg.vault.model.BasicModel;

//@Entity
//@Table(name = "list_item")
public class Item extends BasicModel {

//	@ManyToOne
//	public User creator;
//
//	@ManyToOne(optional = false)
//	public VaultList list;
//
//	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
//	@OrderBy("created DESC")
//	public java.util.List<ItemVersion> versions = new ArrayList<ItemVersion>();
//
//	public ItemVersion getCurrentVersion() {
//		if (versions == null || versions.size() == 0) {
//			return null;
//		}
//		return versions.get(0);
//	}

	/*public String getKey() {
		return list.uid.toUpperCase() + "-" + id;
	}

	public String getTitle() {
		if (getCurrentVersion() != null && list.getField("title") != null) {
			return getCurrentVersion().getValue(list.getField("title")).getDisplayValue();
		}
		return "";
	}

	public String getDisplayName() {
		String key = getKey();
		String title = getTitle();

		if (StringUtils.isEmpty(title)) {
			return key;
		}
		return key + " - " + title;
	}

	private String generateUrl(String url) {
		Map<String, Object> args = new HashMap<String, Object>();
		args.put("id", id);
		ActionDefinition ad = Router.reverse(url, args);
		ad.absolute();
		return ad.url;
	}

	public String getDownloadUrl() {
		return generateUrl("Items.download");
	}

	public String getPreviewUrl() {
		return generateUrl("Items.preview");
	}

	public String getUrl() {
		return generateUrl("Lists.item");
	}

	private Map serializeToMinimalMap() {
		Map<String, Object> out = new HashMap<>();
		out.put("id", id);
		out.put("key", getKey());
		out.put("list", list.uid);
		return out;
	}

	@Override
	public Map serializeToMap() {
		ItemVersion current = getCurrentVersion();
		Map<String, Object> out = new HashMap<>();

		out.put("id", id);
		out.put("key", getKey());
		out.put("list", list.uid);
		out.put("itemUrl", getUrl().replace("application.baseUrl", ""));
		if (null != current) {
			out.putAll(current.serializeToMap());
		}

		return out;
	}

	public Map serializeToMapWithVersions() {
		Map out = serializeToMap();

		java.util.List<Map<String, Object>> versionList = new ArrayList<>();
		for (ItemVersion version : versions) {
			Map<String, Object> versionOut = version.serializeToMap();
			if (null != version.creator) {
				versionOut.put("user", version.creator.getName());
			} else {
				versionOut.put("user", "N/A");
			}
			versionOut.put("changed", version.created);
			versionList.add(versionOut);
		}
		out.put("versions", versionList);

		return out;
	}

	@Override
	public void _delete() {
		for (ItemVersion version : versions) {
			version.relatedItems.clear();
			version.save();
		}

		super._delete();
	}

	@PostRemove
	private void removeMQEvent() {
		MQPlugin.publish(this.serializeToMinimalMap(), models.data.Item.class, MQPlugin.MessageIndicator.Delete);
	}*/
}
