package com.zensar.bankingsystem.services;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Address;
import com.zensar.bankingsystem.beans.Customer;
import com.zensar.bankingsystem.beans.Transaction;
import com.zensar.bankingsystem.dao.BankingRepositoryServices;
import com.zensar.bankingsystem.dao.ZensarBankingSystemArrayImpl;

public class ZensarBankingServiceImpl implements ZensarBankingServices {

	BankingRepositoryServices zensarBankingSystemArray;

	public ZensarBankingServiceImpl() {
		zensarBankingSystemArray = new ZensarBankingSystemArrayImpl();

	}

	/*
	 * public void transfer(int accountId, int tansferAccountId, double amount)
	 * { double a = zensarBankingSystemArray.getAccount(accountId).getBalance()
	 * - amount; System.out.println(a);
	 * zensarBankingSystemArray.getAccount(accountId).setBalance(a); double b =
	 * zensarBankingSystemArray.getAccount(accountId).getBalance() + amount;
	 * zensarBankingSystemArray.getAccount(tansferAccountId).setBalance(b);
	 * 
	 * }
	 */

	@Override
	public int acceptCustomerDetails(String custName, String HomeAddressCity,
			String HomeAddressState, int HomeAddressPincode,
			String LocalAddressCity, String LocalAddressState,
			int LocalAddressPincode) {

		return zensarBankingSystemArray.insertCustomer(new Customer(custName,
				new Address(LocalAddressCity, LocalAddressState,
						LocalAddressPincode), new Address(HomeAddressCity,
						HomeAddressState, HomeAddressPincode)));

	}

	@Override
	public int openAccount(int custId, int balance, String accType) {

		int accountId = 0;

		if (custId < 99) {
			System.out
					.println("Invalid customer Id,please enter a valid customer Id");
		} else if (!(accType.equalsIgnoreCase("savings")
				|| accType.equalsIgnoreCase("current") || accType
					.equalsIgnoreCase("salary"))) {
			System.out
					.println("Invalid account type, please enter a valid account type");
		} else if (balance < 0) {
			System.out.println("Invalid amount, please amount a valid amount");
		}

		else {
			Customer customer = zensarBankingSystemArray.getCustomer(custId);

			if (customer == null) {
				System.out.println("Sorry you have not registered");
				return 0;
			} else {
				Account account = new Account(accType, balance);
				accountId = zensarBankingSystemArray.insertAccount(account,
						custId);
			}
		}

		return accountId;

	}

	@Override
	public int getAccountBalance(int custId, int accNo) {

		return zensarBankingSystemArray.getAccount(custId, accNo).getBalance();

	}

	@Override
	public int withdraw(int custId, int accNo, int amt) {
		int balance = 0;
		if (amt < 0) {
			System.out.println("Invalid amount, please enter a valid amount");
		} else {

			Customer customer = zensarBankingSystemArray.getCustomer(custId);

			if (customer == null) {
				return 0;
			} else {
				Account account = zensarBankingSystemArray.getAccount(custId,
						accNo);
				if (account == null) {
					System.out.println("Sorry your account does not exist");
				} else {
					if ((account.getBalance() - amt) > 0) {
						account.setBalance(account.getBalance() - amt);
						balance = account.getBalance();
					}
				}
			}
		}
		return balance;
	}

	@Override
	public boolean fundTransfer(int custIdFrom, int accNoFrom, int custIdTo,
			int accNoTo, int amt) {
		if (withdraw(custIdFrom, accNoFrom, amt) > 0) {
			deposit(custIdTo, accNoTo, amt);
			return true;
		}
		return false;
	}

	@Override
	public int deposit(int custId, int accNo, int amt) {
		if (amt < 0) {
			System.out.println("Invalid amount, please enter a valid amount");
		} else {

			zensarBankingSystemArray.getAccount(custId, accNo).setBalance(
					zensarBankingSystemArray.getAccount(custId, accNo)
							.getBalance() + amt);

			return zensarBankingSystemArray.getAccount(custId, accNo)
					.getBalance();
		}
		return 0;
	}

	@Override
	public Customer getCustomerDetails(int custId) {
		
		return null;
	}

	@Override
	public Account getAccountDetails(int custId, int accNo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account[] getAllAccountsDetails(int custId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Transaction[] getAllTransactionDetails(int custId, int accNo) {
		// TODO Auto-generated method stub
		return null;
	}

}
