package com.mastering.rmi.bankrmi;

import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * The following error occur when the Remote Method has not a throws RemoteException
 * java.rmi.server.ExportException: remote object implements illegal remote interface;
 *
 */

public interface Bank extends Institution, Remote {

	Account getAccountFrom(String accountCode) throws RemoteException;
	
	void deposit(Account account, double value) throws Exception; //Its ok to throws an Exception because a RemoteException is a Exception
	
	void credit(Account account, double value) throws IOException;//Its ok to thows an IOException because a RemoteException is a IOException
	
}
