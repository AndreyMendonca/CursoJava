package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];
		for(int i = 0; i < n; i++) {
			System.out.println("PRODUCT NUMBER: " + i);
			sc.nextLine();
			System.out.print("NAME: ");
			String name = sc.nextLine();
			System.out.print("PRICE: ");
			double price = sc.nextDouble();
			vect[i] = new Product(name,price);
		}
		
		double sum = 0.0;
		for(int i = 0; i < n; i++) {
			sum += vect[i].getPrice();
		}
		double avg = 0.0;
		avg = sum/n;
		
		System.out.printf("AVG PRICE PRODUCTS = $ %.2f%n", avg);
		

		sc.close();
	}
}
