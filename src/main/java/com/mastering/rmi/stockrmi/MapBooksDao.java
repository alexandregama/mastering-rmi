package com.mastering.rmi.stockrmi;

import java.util.HashMap;
import java.util.Map;

public class MapBooksDao implements Books {

	private static Map<String, Book> database = new HashMap<>();
	
	static {
		database.put("SOA", new Book("SOA", 10));
		database.put("REST", new Book("REST", 8));
		database.put("TDD", new Book("TDD", 15));
	}
	
	@Override
	public Book findBy(String code) {
		return database.get(code);
	}

}
