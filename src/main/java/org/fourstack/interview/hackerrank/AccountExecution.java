package org.fourstack.interview.hackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AccountExecution {
	
	public static void main(String[] args) {
		List<Account> accounts = new ArrayList<>();
		
		
		accounts.add(new Account(6, 3, "Manjunath"));
		accounts.add(new Account(8, 9, "Vinay"));
		accounts.add(new Account(12, 13, "Sunil"));
		accounts.add(new Account(8, 13, "Kiran"));
		accounts.add(new Account(1, 1, "Manoj"));
		accounts.add(new Account(9, 1, "Sachin"));
		accounts.add(new Account(12, 6, "Raju"));
		
		System.out.println(accounts);
		
		List<Account> sortedAccounts = accounts.stream().sorted().collect(Collectors.toList());
		
		System.out.println("\n\n\n");
		System.out.println(sortedAccounts);
	}
}
