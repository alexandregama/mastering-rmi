package com.mastering.rmi.bankrmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class BankServiceRendpointRegister {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		LocateRegistry.createRegistry(1099);
		Naming.rebind("/bankservice", new BankService());
		System.out.println("BankService Endpoint is Active!");
	}
	
}
