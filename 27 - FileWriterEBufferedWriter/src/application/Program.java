package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void  main(String[] args) {
		String[] lines = new String[]{"Andrey","Maria","Jorge","Valtemir"};
 		String path = "C:\\Users\\andre\\criando.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			for(String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage() ) ;
		}
		
		/* 
		 * caso você queira gravar dados em um documento que já esta criado
		 * ou seja, acrescentar informações
		 * uitlizamos o 
		 * try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true)
		 * 
		 * Colocando o TRUE depois do Path quando for criado o FileWriter
		 * */
	}
}
