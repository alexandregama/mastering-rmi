package com.mastering.rmi.model;

import java.io.Serializable;

public class Guest extends User implements Serializable {

	private static final long serialVersionUID = -614646735309707184L;

	private String address;

	private Boolean hasKids;
	
	public Guest() {
		System.out.println("Building a Guest!");
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getHasKids() {
		return hasKids;
	}

	public void setHasKids(Boolean hasKids) {
		this.hasKids = hasKids;
	}

	@Override
	public String toString() {
		return "Guest [address=" + address + ", hasKids=" + hasKids + "]";
	}

}
