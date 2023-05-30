import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Olá Mundo!!");
		
		//leitura de scanner
		Scanner sc = new Scanner(System.in);
		String x;
		System.out.println("Digite uma palavra: " );
		x = sc.next();
		System.out.println("Você digitou: " + x);
		int y;
		System.out.println("Digite um numero: " );
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		sc.close();
		
		//Como mudar a localizacao//
		Locale.setDefault(Locale.US);

		//Algumas operações matematicas
		/*
		 * teremos o Math.pow() para potencia
		 *	Math.abs() para valor absoluto
		 *	Math.sqrt() para raiz de um valor
		 */ 
		double z = 25.0;
		double resultado;
		resultado = Math.sqrt(z);
		System.out.println("Raiz de 25: " + resultado);
		resultado = Math.pow(z,2);
		System.out.println("5 ao quadrado: " + resultado);
		
		
	}
}
