package com.mastering.rmi.bankrmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Bank extends Remote {

	Account getAccountFrom(String accountCode) throws RemoteException;
	
}
