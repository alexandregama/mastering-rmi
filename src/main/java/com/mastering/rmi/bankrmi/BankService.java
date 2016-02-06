package com.mastering.rmi.bankrmi;

import java.io.IOException;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class BankService extends UnicastRemoteObject implements Bank {

	private static final long serialVersionUID = 3637313570544135335L;
	
	private AccountsDao dao = new AccountsDao();
	
	protected BankService() throws RemoteException {
		super();
	}
	
	@Override
	public Account getAccountFrom(String accountCode) throws RemoteException { //We don't need to write this Exception here
		return dao.from(accountCode);
	}

	@Override
	public void deposit(Account account, double value) throws Exception {
		//Do something
	}

	@Override
	public void credit(Account account, double value) throws IOException {
		//Do something
	}

	@Override
	public void approve() {
		//Do something
	}

	@Override
	public void disaprove() {
		//Do something
	}

}
