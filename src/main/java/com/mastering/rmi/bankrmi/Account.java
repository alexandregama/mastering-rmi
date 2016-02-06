package com.mastering.rmi.bankrmi;

import java.io.Serializable;

public class Account implements Serializable {

	private static final long serialVersionUID = 5352858880180183477L;
	
	private String code;
	
	public Account(String code) {
		this.code = code;
	}
	
	public String getCode() {
		return code;
	}
	
}
