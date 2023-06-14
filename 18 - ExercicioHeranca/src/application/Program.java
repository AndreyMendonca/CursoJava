package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> employees = new ArrayList<>();
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data:");
			System.out.print("Outsourced (y/n)? ");
			char resposta = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Integer hours = sc.nextInt();
			System.out.print("Value per hours: ");
			Double value = sc.nextDouble();
			Employee e;
			if(resposta == 'n') {
				e = new Employee(name, hours, value);
			}else {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				e = new OutsourceEmployee(name, hours, value, additional);
			}
			employees.add(e);
		}
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee e : employees) {
			System.out.println(e.getName() + " - $"+String.format("%.2f", e.payment()));
		}
		
		sc.close();
	}
}
