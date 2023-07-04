package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String path = "C:\\Users\\andre\\produtos.csv";
		List<Product> list = new ArrayList<>();
		
		
		try (BufferedReader bf = new BufferedReader(new FileReader(path))){
			String line = bf.readLine();
			while(line != null) {
				String[] read = line.split(",");
				Product p = new Product(read[0], Double.parseDouble(read[1]));
				list.add(p);
				line = bf.readLine();
			}
			
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		Product x = CalculationService.max(list);
		System.out.println("PRICE MAX: ");
		System.out.println(x);
	}
}
