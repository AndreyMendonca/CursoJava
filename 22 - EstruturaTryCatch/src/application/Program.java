package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid position! ");
			
			//*** OPERAÇÃO PARA PEGAR QUAL O ERRO ***//
			e.printStackTrace();
			
			sc.next();
		}catch(InputMismatchException e) {
			//*** usamos o getMessage() para pegar a mensagem de erro e imprimir ***/
			System.out.println("Input Erro! " + e.getMessage() );
		}finally {
			System.out.println("End of program");
			sc.close();	
		}
	}
}	
