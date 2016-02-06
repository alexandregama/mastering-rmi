package com.mastering.rmi;

import static org.junit.Assert.*;

import java.rmi.Naming;

import org.junit.Test;

import com.mastering.rmi.stockrmi.Stock;

public class StockServiceRmiTest {

	@Test
	public void shouldRetrieveBookQuantityFromItsCodeUsingRMI() throws Exception {
		Stock service = (Stock) Naming.lookup("rmi://127.0.0.1:1099/stock");
		
		int quantity = service.getQuantityFrom("SOA");
		
		assertEquals(10, quantity);
	}
}
