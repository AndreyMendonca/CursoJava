package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number:");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial balance: " );
			Double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			Double withdraw = sc.nextDouble();
			account.withdraw(withdraw);
			
			System.out.println();
			System.out.println("New balance: " + account.getBalance());
			
		}catch(InputMismatchException e) {
			System.out.println("Invalid number format");
		}catch(DomainException e) {
			System.out.println(e.getMessage());
		}
		
		
		sc.close();
	}
}
