package com.mastering.rmi.bankrmi;

import java.util.HashMap;
import java.util.Map;

public class AccountsDao {

	private static Map<String, Account> database = new HashMap<>();
	
	static {
		database.put("1234", new Account("1234"));
	}
	
	public Account from(String accountCode) {
		return database.get(accountCode);
	}

}
