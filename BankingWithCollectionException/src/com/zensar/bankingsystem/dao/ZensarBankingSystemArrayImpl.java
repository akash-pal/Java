package com.zensar.bankingsystem.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Transaction;

public class ZensarBankingSystemArrayImpl implements BankingRepositoryServices {

	Map<Integer, Customer> cust = new HashMap<Integer, Customer>();

	static int i = 0, j = 0, custId = 100, accId = 50, tranId = 1;

	@Override
	public int insertCustomer(Customer customer) {
		cust.put(new Integer(custId), customer);
		customer.setCustomerId(custId);
		custId++;
		return customer.getCustomerId();
	}

	@Override
	public Customer getCustomer(int custId) {
		Customer c = cust.get(new Integer(custId));
		if (c != null)
			return c;

		return null;
	}

	@Override
	public boolean updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateTransaction(int custId, int accNo,
			Transaction transaction) {
		transaction.setTransactionID(tranId++);
		ArrayList<Transaction> transactions = getAccount(custId, accNo)
				.getTransactions();
		transactions.add(transaction);
		getAccount(custId, accNo).setTransactions(transactions);
		return false;
	}

	@Override
	public Account getAccount(int custId, int accNo) {

		ArrayList<Account> acc = getCustomer(custId).getAccount();

		for (Account account : acc) {
			if (account.getAccountId() == accNo) {
				return account;
			}
		}

		return null;
	}

	@Override
	public ArrayList<Account> getAccountList(int custId) {
		ArrayList<Account> acc = getCustomer(custId).getAccount();
		return acc;
	}

	@Override
	public ArrayList<Transaction> getTransactions(int custId, int accNo) {
		ArrayList<Transaction> transactions = getAccount(custId, accNo)
				.getTransactions();
		return transactions;
	}

	@Override
	public boolean deleteCustomer(int custId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAccount(int custId, int accNo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int insertAccount(Account account, int custId) {

		ArrayList<Account> acc = getCustomer(custId).getAccount();

		if (acc.size() <= 2) {
			Boolean result = acc.add(new Account(accId, account
					.getAccountType(), account.getBalance()));

			if (result == true) {
				return accId++;
			}
		}

		return 0;
	}

	@Override
	public boolean updateAccount(int custId, Account account) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
