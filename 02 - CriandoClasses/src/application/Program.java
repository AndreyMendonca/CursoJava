package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangulo;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Triangulo a, b;
		a = new Triangulo();
		b = new Triangulo();
		System.out.println("TRINGULO A");
		System.out.println("Digite o primeiro valor");
		a.a = sc.nextInt();
		System.out.println("Digite o segundo valor");
		a.b = sc.nextInt();
		System.out.println("Digite o terceiro valor");
		a.c = sc.nextInt();
		System.out.println("TRINGULO B");
		System.out.println("Digite o primeiro valor");
		b.a = sc.nextInt();
		System.out.println("Digite o segundo valor");
		b.b = sc.nextInt();
		System.out.println("Digite o terceiro valor");
		b.c = sc.nextInt();
		
		
		System.out.println("VALORES DO A");
		System.out.println("A = " + a.a + " B = " + a.b + " C = " + a.c);
		System.out.println("VALORES DO B");
		System.out.println("A = " + b.a + " B = " + b.b + " C = " + b.c);
		
		double areaA = a.area();
		double areaB = b.area();
		
		System.out.println("AREA: A=" + areaA + " AREA: B=" + areaB);
		
		sc.close();
		
	}
}
