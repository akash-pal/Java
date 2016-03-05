package com.zensar.bankingsystem.client;

import java.util.ArrayList;
import java.util.Scanner;

import javax.security.auth.kerberos.ServicePermission;
import javax.security.auth.login.AccountNotFoundException;

import com.zensar.bankingsystem.beans.Account;
import com.zensar.bankingsystem.beans.Transaction;
import com.zensar.bankingsystem.exceptions.CustomerNotFoundException;
import com.zensar.bankingsystem.exceptions.InsufficientBalanceException;
import com.zensar.bankingsystem.exceptions.InvalidAccountNoException;
import com.zensar.bankingsystem.exceptions.InvalidAccountTypeException;
import com.zensar.bankingsystem.exceptions.InvalidAmountException;
import com.zensar.bankingsystem.exceptions.InvalidCustomerIdException;
import com.zensar.bankingsystem.exceptions.InvalidPincodeException;
import com.zensar.bankingsystem.serviceprovider.ServiceProvider;
import com.zensar.bankingsystem.services.BankServices;
import com.zensar.bankingsystem.services.ZensarBankingServiceImpl;

public class ClientCode {

	public static void main(String[] args) {
		String name = null;
		String localAdrressCity = null;
		String localAdrressState = null;
		int localAdrressPinCode = 0;
		String homeAdrressCity = null;
		String homeAdrressState = null;
		int homeAdrressPinCode = 0;
		int customerId = 0;
		String accountType = null;
		int initialBalance = 0;
		char decision;
		int choice = 0;
		int amount = 0, balance = 0;

		Scanner scanner = new Scanner(System.in);

		BankServices zensarBankingService = ServiceProvider.getProvider();
		System.out.println("Welcome to Zensar Banking Service");

		do {

			System.out.println("1. Customer Registration");
			System.out.println("2. Open Account");
			System.out.println("3. Withdraw");
			System.out.println("4. Deposit");
			System.out.println("5. Transfer");
			System.out.println("6. Check balance");
			System.out.println("8. Get Account details");
			System.out.println("9. Get all account details");
			System.out.println("Enter your option");
			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				// Registration
				System.out.println("Enter your name");
				name = scanner.next();

				System.out.println("Enter your local address");
				System.out.println("Enter your city");
				localAdrressCity = scanner.next();
				System.out.println("Enter your state");
				localAdrressState = scanner.next();
				System.out.println("Enter your pin code");
				localAdrressPinCode = scanner.nextInt();

				System.out.println("Enter your home address");
				System.out.println("Enter your city");
				homeAdrressCity = scanner.next();
				System.out.println("Enter your state");
				homeAdrressState = scanner.next();
				System.out.println("Enter your pin code");
				homeAdrressPinCode = scanner.nextInt();

				int id;
				try {
					id = zensarBankingService.acceptCustomerDetails(name,
							localAdrressCity, localAdrressState,
							localAdrressPinCode, homeAdrressCity,
							homeAdrressState, homeAdrressPinCode);
					System.out
							.println("You were successfully registered with customer ID "
									+ id);
				} catch (InvalidPincodeException e) {
					System.out.println(e.getMessage());
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;

			case 2:
				// open an account
				System.out.println("Enter your customer Id to open an account");
				customerId = scanner.nextInt();

				System.out.println("Enter your account type ");
				accountType = scanner.next();

				System.out.println("Enter your initial balance ");
				initialBalance = scanner.nextInt();
				int accountId;
				try {
					accountId = zensarBankingService.openAccount(customerId,
							initialBalance, accountType);
					if (accountId == 0) {
						System.out.println("Account limit exceeded");
					} else {
						System.out.println("Account created with account Id "
								+ accountId);
					}
				} catch (InvalidCustomerIdException e) {
					System.out.println(e.getMessage());
				} catch (InvalidAccountTypeException e) {
					System.out.println(e.getMessage());
				} catch (InvalidAmountException e) {
					System.out.println(e.getMessage());
				} catch (CustomerNotFoundException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 3:
				// withdraw
				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				System.out.println("Enter your account Id");
				accountId = scanner.nextInt();
				System.out.println("Enter the amount to withdraw");
				amount = scanner.nextInt();

				try {
					balance = zensarBankingService.withdraw(customerId,
							accountId, amount);
					System.out
							.println("Amount withdrawn successfully with remaining balance "
									+ balance);
				} catch (AccountNotFoundException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidCustomerIdException e1) {
					System.out.println(e1.getMessage());
				} catch (CustomerNotFoundException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidAccountNoException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidAmountException e1) {
					System.out.println(e1.getMessage());
				} catch (InsufficientBalanceException e1) {
					System.out.println(e1.getMessage());
				}

				break;
			case 4:
				// deposit
				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				System.out.println("Enter your account Id");
				accountId = scanner.nextInt();
				System.out.println("Enter the amount to deposit");
				amount = scanner.nextInt();

				try {
					balance = zensarBankingService.deposit(customerId,
							accountId, amount);
					System.out
							.println("Amount successfully deposited, balance is  "
									+ balance);

				} catch (AccountNotFoundException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidCustomerIdException e1) {
					System.out.println(e1.getMessage());
				} catch (CustomerNotFoundException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidAccountNoException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidAmountException e1) {
					System.out.println(e1.getMessage());
				} catch (InsufficientBalanceException e1) {

				}

				break;
			case 5:
				System.out.println("Enter your customer Id");
				int custIdFrom = scanner.nextInt();
				System.out.println("Enter your account Id");
				int accNoFrom = scanner.nextInt();
				System.out.println("Enter the customer Id to transfer to");
				int custIdTo = scanner.nextInt();
				System.out.println("Enter the account Id to transfer to");
				int accNoTo = scanner.nextInt();
				System.out.println("Enter the amount to tansfer");
				int amt = scanner.nextInt();

				try {
					boolean result = zensarBankingService.fundTransfer(
							custIdFrom, accNoFrom, custIdTo, accNoTo, amt);
					if (result == true) {
						System.out.println("Fund transfer successful");
					} else {
						System.out.println("Fund transfer not successful");
					}
				} catch (AccountNotFoundException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidCustomerIdException e1) {
					System.out.println(e1.getMessage());
				} catch (CustomerNotFoundException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidAccountNoException e1) {
					System.out.println(e1.getMessage());
				} catch (InvalidAmountException e1) {
					System.out.println(e1.getMessage());
				} catch (InsufficientBalanceException e1) {
					System.out.println(e1.getMessage());
				}
				break;
			case 6:
				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				System.out.println("Enter your account Id");
				accountId = scanner.nextInt();
				try {
					int b = zensarBankingService.getAccountBalance(customerId,
							accountId);
					System.out.println(b);
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (InvalidCustomerIdException e) {
					System.out.println(e.getMessage());
				} catch (CustomerNotFoundException e) {
					System.out.println(e.getMessage());
				} catch (InvalidAccountNoException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 8:
				// get account details
				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				System.out.println("Enter your account Id");
				accountId = scanner.nextInt();
				Account acc;
				try {
					acc = zensarBankingService.getAccountDetails(customerId,
							accountId);

					System.out.println("Account No " + acc.getAccountId());
					System.out.println("Account Type " + acc.getAccountType());
					System.out.println("Account Balance " + acc.getBalance());

					System.out.println("Transactions:");
					ArrayList<Transaction> transactions = zensarBankingService
							.getAllTransactionDetails(customerId, accountId);
					for (Transaction transaction : transactions) {
						System.out.println("\nID: "
								+ transaction.getTransactionID());
						System.out.println("Type: "
								+ transaction.getTransactionType());
						System.out.println("Amount: "
								+ transaction.getTransactionAmount() + "\n");
					}

				} catch (AccountNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidCustomerIdException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CustomerNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 9:
				// get all account details
				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				ArrayList<Account> a;
				try {
					a = zensarBankingService.getAllAccountsDetails(customerId);
					System.out.println("Account deatils are:");
					for (Account account : a) {
						if (account != null) {
							System.out.println("Account No: "
									+ account.getAccountId());
							System.out.println("Account Type: "
									+ account.getAccountType());
							System.out.println("Account Balance: "
									+ account.getBalance());

							System.out.println("Transactions:");
							ArrayList<Transaction> transactions = zensarBankingService
									.getAllTransactionDetails(customerId,
											account.getAccountId());
							for (Transaction transaction : transactions) {
								System.out.println("\nID: "
										+ transaction.getTransactionID());
								System.out.println("Type: "
										+ transaction.getTransactionType());
								System.out.println("Amount: "
										+ transaction.getTransactionAmount()
										+ "\n");
							}
							
							System.out.println("****************");
						}
					}
				} catch (InvalidCustomerIdException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (CustomerNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (AccountNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvalidAccountNoException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				break;
			default:
				System.out.println("Invalid choice");
				break;
			}

			System.out.println("Do you wish to continue?(Y/N)");
			decision = scanner.next().charAt(0);
			if (decision == 'n' || decision == 'N') {
				System.out.println("Thank you for using the banking system");
				System.exit(0);
			}
		} while (decision == 'y' || decision == 'Y');

		scanner.close();
	}
}
