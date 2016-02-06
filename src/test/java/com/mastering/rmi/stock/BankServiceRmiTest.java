package com.mastering.rmi.stock;

import static org.junit.Assert.assertEquals;

import java.rmi.Naming;

import org.junit.Test;

import com.mastering.rmi.bankrmi.Account;
import com.mastering.rmi.bankrmi.Bank;

public class BankServiceRmiTest {

	@Test
	public void shouldRetrieveAnAccountFromItsCodeUsingRMI() throws Exception {
		Bank service = (Bank) Naming.lookup("rmi://127.0.0.1:1099/bankservice");
		Account account = service.getAccountFrom("1234");
		
		assertEquals("1234", account.getCode());
	}
}
