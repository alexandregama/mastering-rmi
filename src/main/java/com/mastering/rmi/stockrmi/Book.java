package com.mastering.rmi.stockrmi;

public class Book {

	private String code;
	private int quantity;

	public Book(String code, int quantity) {
		this.code = code;
		this.quantity = quantity;
	}

	public String getCode() {
		return code;
	}

	public int getQuantity() {
		return quantity;
	}

}
