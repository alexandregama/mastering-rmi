package com.mastering.rmi.stockrmi;

public class StockService implements Stock {

	private Books books = new MapBooksDao();
	
	@Override
	public int getQuantityFrom(String code) {
		Book book = books.findBy(code);
		
		return book.getQuantity();
	}

}
