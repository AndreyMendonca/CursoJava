package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		Double amount = sc.nextDouble();
		System.out.print("Meses: ");
		Integer months = sc.nextInt();
		System.out.print("Pagamento apos " + months + " meses:");
		
		InterestService is = new BrazilInterestService(2.0);
		double payment  = is.payment(amount, months);
		
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}
}
