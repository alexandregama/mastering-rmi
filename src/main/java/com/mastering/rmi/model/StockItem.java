package com.mastering.rmi.model;

import java.io.Serializable;

public class StockItem implements Serializable {

	private static final long serialVersionUID = 4536981990257978981L;

	private Long id;

	private Book book;

	private int quantity;

	public StockItem(Long id, Book book, int quantity) {
		this.id = id;
		this.book = book;
		this.quantity = quantity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
