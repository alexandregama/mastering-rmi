package com.mastering.rmi.model;

import java.io.Serializable;

public class Book implements Serializable {

	private static final long serialVersionUID = 4775266810812172367L;

	private Long id;

	private String title;
	
	private String code;

	public Book(Long id, String code, String title) {
		this.id = id;
		this.code = code;
		this.title = title;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

}
