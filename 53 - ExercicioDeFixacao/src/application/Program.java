package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String path = "C:\\Users\\andre\\produtos.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			List<Employee> list = new ArrayList<>();
			String line = br.readLine();
			
			while( line != null ) {
				String[] fields = line.split(",");
				String name = fields[0];
				String email = fields[1];
				Double salary = Double.parseDouble(fields[2]);
				
				Employee employee = new  Employee(name, email, salary);
				
				list.add(employee);
				
				line = br.readLine();
			}
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
			
			System.out.print("Enter salary: ");
			Double salary = sc.nextDouble();
			List<String> emails = list.stream()
									.filter(p -> p.getSalary() > salary)
									.map(p -> p.getEmail())
									.sorted(comp)
									.collect(Collectors.toList());
			
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary));
			for(String s : emails) {
				System.out.println(s);
			}
			
			Double sumSalary = list.stream()
								.filter(p -> p.getName().charAt(0) == 'M')
								.map(p -> p.getSalary())
								.reduce(0.0, (x,y)->x + y);
			
			System.out.println("Sum of salary from people whose name starts with 'M': " + String.format("%.2f", sumSalary));;
			
		}catch(IOException e) {
			System.out.println("Erro" + e.getMessage());
		}
		
		
		sc.close();
		
		
	}
}
