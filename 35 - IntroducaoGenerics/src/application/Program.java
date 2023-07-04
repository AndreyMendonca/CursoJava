package application;

import java.util.Scanner;

import service.PrintService;


public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer>  ps = new PrintService();
		
		
		System.out.print("How many number: ");
		int number = sc.nextInt();
		
		for(int i = 1; i <= number; i++) {
			Integer n = sc.nextInt();
			ps.addValue(n);
		}
		
		System.out.println("Frist number: " + ps.first());
		
		ps.print();
		
		
		
		
		
		sc.close();
	}
}
