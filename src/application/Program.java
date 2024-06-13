package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.AccountLimitException;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer num = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			Double balance = sc.nextDouble();
			sc.nextLine();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			System.out.println("");
			
			Account acc = new Account(num, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			
			System.out.printf("New balance: " + String.format("%.2f", acc.getBalance()));
		
		}catch(AccountLimitException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("Account not found");
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error");
		}
		
		sc.close();
	}

}
