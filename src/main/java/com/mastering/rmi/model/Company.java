package com.mastering.rmi.model;

import java.io.Serializable;

public class Company implements Serializable {

	private static final long serialVersionUID = -577389436433226551L;

	private Long id;
	
	private String name;
	
	transient private String address;
	
	private static Long employeesQuantity;

	public Company(Long id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public static Long getEmployeesQuantity() {
		return employeesQuantity;
	}

	public static void setEmployeesQuantity(Long employeesQuantity) {
		Company.employeesQuantity = employeesQuantity;
	}
	
}
