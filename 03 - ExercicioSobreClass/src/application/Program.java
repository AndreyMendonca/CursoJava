package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		Product tv = new Product();
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		tv.name = sc.next();
		System.out.print("Price: ");
		tv.price = sc.nextDouble();
		System.out.print("Quantity in stock: ");
		tv.quantity = sc.nextInt();
		
		//System.out.println(tv.name + ", " + tv.price + ", " + tv.quantity);
		System.out.println("product date: " + tv);
		sc.close();
	}
}
