package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter account number: " );
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)?");
		char resposta = sc.next().charAt(0);
		double valor;
		ContaBancaria cb;
		if(resposta == 'y') {
			System.out.print("Enter initial deposit value: ");
			valor = sc.nextDouble();
			cb = new ContaBancaria(numero, nome,valor);
		}else {
			cb = new ContaBancaria(numero, nome);
		}
		
		System.out.println("Account data:  " + cb);
		System.out.println();
		
		System.out.print("Enter a deposit value:  ");
		valor = sc.nextDouble();
		cb.adicionarValor(valor);
		System.out.print("Updated account data: " + cb);
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		valor = sc.nextDouble();
		cb.retirarValor(valor);
		System.out.print("Updated account data: " + cb);
		sc.close();
	}
}
