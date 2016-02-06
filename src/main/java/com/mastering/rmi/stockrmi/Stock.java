package com.mastering.rmi.stockrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Stock extends Remote {

	int getQuantityFrom(String code) throws RemoteException;
	
}
