package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] vector = new double[n];
		for(int i = 0; i < n; i++) {
			System.out.print("DIGITE O VALOR NA POSICAO " + i + " = ");
			vector[i]= sc.nextDouble();
		}
		
		//registrando vetores
		double avg = 0.0;
		for(int i = 0; i < n; i++) {
			avg += vector[i];
		}
		
		// media
		avg = avg/n;
		System.out.printf("MEDIA DOS NUMEROS = %.2f%n", avg);
		
		
		sc.close();
	}
}	
