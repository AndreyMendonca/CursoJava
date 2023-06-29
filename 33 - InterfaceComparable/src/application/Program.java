package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		// Operação para realizar a ordenação de um arquivo texto usando  o collections
		String path = "C:\\Users\\andre\\texto.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String name = br.readLine();

			while (name != null) {
				list.add(name);
				name = br.readLine();
			}
			Collections.sort(list);
			for (String s : list) {
				System.out.println(s);
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println();
		System.out.println();
		System.out.println();
		//Fazendo a operacao com CSV e usando CompareTo
		
		operacaoCompareTo();
	}
	public static void operacaoCompareTo() {
		List<Employee> list = new ArrayList<>();
		String path = "C:\\Users\\andre\\salarios.csv";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String employeeCsv = br.readLine();
			while(employeeCsv != null) {
				String[] dados = employeeCsv.split(",");
				list.add(new Employee(dados[0],Double.parseDouble(dados[1])));
				employeeCsv = br.readLine();
			}
			Collections.sort(list);
			for(Employee e : list) {
				System.out.println(e.getName() + " - " + e.getSalary());
			}
		}catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
