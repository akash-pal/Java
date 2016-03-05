package com.zensar.bankingsystem.dao;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Customer;

public class ZensarBankingSystemArray {

	Customer[] customers = new Customer[10];

	static int i = 0, j = 0, custId = 100, accId = 50;

	public int storeCustomer(Customer customer) {

		customers[i++] = customer;
		customer.setCustomerId(custId);
		custId++;
		return customer.getCustomerId();

	}

	public Customer getCustomer(int customerId) {

		for (Customer c : customers) {
			if (c != null && c.getCustomerId() == customerId)
				return c;

		}
		return null;
	}

	public int setAccount(Customer customer, Account account) {

		Account[] acc = customer.getAccount();

		for (int k = 0; k < 3; k++) {

			if (acc[k] == null) {
				acc[k] = new Account(accId++, account.getAccountType(),
						account.getBalance());
				return acc[k].getAccountId();
			}
		}
		return 0;
	}

	public Account getAccount(Customer customer, int accountId) {
		Account[] acc = customer.getAccount();
		for (int k = 0; k < 3; k++) {
			if (acc[k].getAccountId() == accountId)
				return acc[k];
			else
				return null;
		}
		return null;
	}

	public Account getAccount(int accountId) {

		for (Customer c : customers) {
			for(Account acc :c.getAccount()){
				if(acc!=null || acc.getAccountId()==accountId)
					return acc;
			}
			
		}
		return null;
	}

}
