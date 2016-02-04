package com.mastering.rmi.stockrmi;

import java.util.HashMap;
import java.util.Map;

public class MapBooksDao implements Books {

	private static Map<String, Book> database = new HashMap<>();
	
	static {
		database.put("SOA", new Book("SOA", 10));
	}
	
	@Override
	public Book findBy(String code) {
		return null;
	}

}
