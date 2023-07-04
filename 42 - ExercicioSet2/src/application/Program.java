package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> students = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int a = sc.nextInt();
		for(int i = 1; i <= a; i++) {
			int student = sc.nextInt();
			students.add(student);
		}
		System.out.print("How many students for course B? ");
		int b = sc.nextInt();
		for(int i = 1; i <= b; i++) {
			int student = sc.nextInt();
			students.add(student);
		}
		System.out.print("How many students for course C? ");
		int c = sc.nextInt();
		for(int i = 1; i <= c; i++) {
			int student = sc.nextInt();
			students.add(student);
		}
		System.out.println("Total students: " + students.size());
		
		
		sc.close();

	}

}
