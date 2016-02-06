package com.mastering.rmi.bankrmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankService extends UnicastRemoteObject implements Bank {

	private static final long serialVersionUID = 3637313570544135335L;
	
	private AccountsDao dao = new AccountsDao();
	
	protected BankService() throws RemoteException {
		super();
	}
	
	@Override
	public Account getAccountFrom(String accountCode) throws RemoteException {
		return dao.from(accountCode);
	}

}
