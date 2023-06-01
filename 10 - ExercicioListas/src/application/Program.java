package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitites.Emplyoee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("How manu employees will be registered? ");
		int n = sc.nextInt();
		
		List<Emplyoee> emplyoee = new ArrayList<>();
		
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Emplyee #" + i);
			System.out.print("ID ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("NAME ");
			String name = sc.nextLine();
			System.out.print("Salary ");
			Double salary = sc.nextDouble();
			emplyoee.add(new Emplyoee(id,name,salary));
		}
		
		System.out.println("Enter the employee id that will have salary increase: ");
		Integer id = sc.nextInt();
		Double percentage = 0.0;
		for(Emplyoee l : emplyoee) {
			if( l.getId() == id) {
				System.out.println("Enter the percentage: ");
				percentage = sc.nextDouble();
				l.updateSalary(percentage);
				break;
			}
		}
		if(percentage == 0.0) {
			System.out.println("ERRO! ID WAS NOT REGISTERED ");
		}
		
		System.out.println("List of employees ");
		for(Emplyoee l : emplyoee) {
			System.out.println(l);
		}
		
		sc.close();
	}
}
