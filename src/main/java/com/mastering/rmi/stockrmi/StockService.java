package com.mastering.rmi.stockrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StockService extends UnicastRemoteObject implements Stock {

	private static final long serialVersionUID = -805923415655109517L;
	
	private Books books = new MapBooksDao();
	
	// This constructor is required by UnicastRemoteObject, cause we need to throw RemoteExcetion in constructor
	protected StockService() throws RemoteException {
		super();
	}
	
	@Override
	public int getQuantityFrom(String code) throws RemoteException {
		Book book = books.findBy(code);
		
		return book.getQuantity();
	}

}
