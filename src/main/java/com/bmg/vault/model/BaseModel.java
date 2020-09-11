package com.bmg.vault.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;


@MappedSuperclass
public abstract class BaseModel  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected Long id;
	protected Date created;
	protected Date modified;

	public Long getId() {
		return id;
	}


	public Object _key() {
		return getId();
	}
}
