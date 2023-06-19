package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int number = sc.nextInt();
		for(int i = 1; i <= number; i++) {
			System.out.print("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual income: : ");
			Double income = sc.nextDouble();
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name,income,healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name,income,employees));
			}
		}
		
		Double totalTaxes = 0.0;
		System.out.println();
		System.out.println("TAXES PAID:");
		for(TaxPayer tp : list) {
			System.out.println(tp);
			totalTaxes += tp.getAnualIncome();
		}
		System.out.println();
		System.out.println("TOTAL PAID: $" + String.format("%.2f", totalTaxes));
		
		sc.close();
	}
}
