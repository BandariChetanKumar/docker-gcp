package com.bmg.vault.item;

import com.bmg.vault.listeners.Listener;
import com.bmg.vault.listeners.Listenerable;
import com.bmg.vault.model.BasicModel;


import javax.persistence.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

//@Entity
//@Table(name = "list_item_version")
public class ItemVersion extends BasicModel implements Listenerable {

	@Transient
	private final List<Listener> listeners = new CopyOnWriteArrayList<Listener>();

	@Override
	public void addListener(Listener listener) {
		this.listeners.add(listener);
	}

	@Override
	public void removeListener(Listener listener) {
		this.listeners.remove(listener);
	}

	/*protected void updateEvent() {
		UpdateEvent event = new UpdateEvent(this);
		for (Listener listener : listeners) {
			listener.update(event);
		}
	}

	@Override
	protected void afterSave() throws Exception {
		super.afterSave();
		updateEvent();
	}

	@ManyToOne
	public User creator;

	@ManyToOne(optional = false)
	public Item item;

	@ElementCollection
	@CollectionTable(name = "list_item_version_related", joinColumns = {@JoinColumn(name="version_id")})
	@Column(name = "related_item")
	public Set<String> relatedItems = new HashSet<>();

	@OneToMany(mappedBy = "version", cascade = CascadeType.ALL)
	public List<FieldValue> values = new ArrayList<>();

	@Transient
	public Map<Long, FieldValue> keyedValues;

	public FieldValue getValue(Field field) {
		return getValue(field.id);
	}

	public FieldValue getValue(String uid) {
		if (uid == null) {
			return null;
		}
		Field field = Field.find("uid = ? and list = ?", uid, item.list)
				.first();
		return getValue(field.id);
	}

	public FieldValue getValue(Long fieldId) {
		if (keyedValues == null) {
			keyedValues = new HashMap<Long, FieldValue>();
			for (FieldValue value : values) {
				if (value.field != null) {
					keyedValues.put(value.field.id, value);
				}
			}
		}

		return keyedValues.get(fieldId);
	}

	public boolean isCurrentVersion() {
		return this == item.getCurrentVersion();
	}

	public static List<ItemVersion> findByRelatedItem(Item item) {
		List<models.data.ItemVersion> versions = find(
				"SELECT v FROM ItemVersion v WHERE ? MEMBER OF v.relatedItems", item).fetch();
		return versions;
	}

	@Override
	public Map serializeToMap() {
		Map<String, Object> outMap = new HashMap<>();

		List related = new LinkedList();

		for(String itemKey : relatedItems) {
			related.add(itemKey);
		}
		outMap.put("related", related);

		Map<String, Object> displayMap = new HashMap<>();
		for (FieldValue value : values) {
			if (null != value.field.uid) {
				Object apiValue = value.getAPIValue();
				outMap.put(value.field.uid, apiValue);
				Object displayValue = value.getDisplayValue();
				if (!displayValue.equals(apiValue)) {
					displayMap.put(value.field.uid, displayValue);
				}
			}
		}
		outMap.put("display", displayMap);
		return outMap;
	}*/
}
