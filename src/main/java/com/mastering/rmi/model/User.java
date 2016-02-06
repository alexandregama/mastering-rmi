package com.mastering.rmi.model;

/**
 * 
 * User is not a Serializable Class but the Serialization works fine, with non-serialization fields in User Class
 *
 */
public class User {

	private Long id;

	private String name;
	
	public User() {
		System.out.println("Building a User!");
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

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

}
