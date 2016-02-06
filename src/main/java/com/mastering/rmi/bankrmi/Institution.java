package com.mastering.rmi.bankrmi;

/**
 * 
 * We need to use a Exception, IOException or RemoteException to be a valid Remote Method
 *
 */

public interface Institution {

	void approve() throws Exception;
	
	void disaprove() throws MyException, Exception;
	
}
