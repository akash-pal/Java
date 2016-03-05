package com.zensar.bankingsystem.client;

import java.util.Scanner;

import com.zensar.bankingsystem.services.ZensarBankingServiceImpl;
import com.zensar.bankingsystem.services.ZensarBankingServices;

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

		ZensarBankingServices zensarBankingService = new ZensarBankingServiceImpl();

		System.out.println("Welcome to Zensar Banking Service");

		do {

			System.out.println("1. Customer Registration");
			System.out.println("2. Open Account");
			System.out.println("3. Withdraw");
			System.out.println("4. Deposit");
			System.out.println("5. Transfer");
			System.out.println("6. Check balance");

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

				int id = zensarBankingService.acceptCustomerDetails(name,
						localAdrressCity, localAdrressState,
						localAdrressPinCode, homeAdrressCity, homeAdrressState,
						homeAdrressPinCode);

				System.out
						.println("You were successfully registered with customer ID "
								+ id);

				break;

			case 2:
				// open an account
				System.out.println("Enter your customer Id to open an account");
				customerId = scanner.nextInt();

				System.out.println("Enter your account type ");
				accountType = scanner.next();

				System.out.println("Enter your initial balance ");
				initialBalance = scanner.nextInt();
				int accountId = zensarBankingService.openAccount(customerId,
						initialBalance, accountType);

				if (accountId == 0) {
					System.out.println("Sorry account could not be created");
				} else {
					System.out.println("Account created with account Id "
							+ accountId);
				}

				break;
			case 3:

				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				System.out.println("Enter your account Id");
				accountId = scanner.nextInt();
				System.out.println("Enter the amount to withdraw");
				amount = scanner.nextInt();

				balance = zensarBankingService.withdraw(customerId, accountId,
						amount);

				if (balance > 0) {
					System.out
							.println("Amount withdrawn successfully with remaining balance "
									+ balance);
				} else if (balance < 0) {
					System.out.println("Cannot withdraw,negative balance");
				} else {
					System.out.println("Sorry you have not registered");
				}

				break;
			case 4:

				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				System.out.println("Enter your account Id");
				accountId = scanner.nextInt();
				System.out.println("Enter the amount to deposit");
				amount = scanner.nextInt();

				balance = zensarBankingService.deposit(customerId, accountId,
						amount);
				System.out
						.println("Amount successfully deposited, balance is  "
								+ balance);

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

				boolean result = zensarBankingService.fundTransfer(custIdFrom,
						accNoFrom, custIdTo, accNoTo, amt);
				if (result == true) {
					System.out.println("Fund transfer successful");
				} else {
					System.out.println("Fund transfer not successful");
				}
				break;
			case 6:
				System.out.println("Enter your customer Id");
				customerId = scanner.nextInt();
				System.out.println("Enter your account Id");
				accountId = scanner.nextInt();
				System.out.println(zensarBankingService.getAccountBalance(
						customerId, accountId));
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
