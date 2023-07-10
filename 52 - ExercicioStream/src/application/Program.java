package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		String path = "C:\\Users\\andre\\produtos.csv";
		
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Product p = new Product(name, price);
				list.add(p);
				line = br.readLine();
			}
			
			System.out.println("Product: ");
			for(Product pr : list) {
				System.out.println(pr);
			}
			
			
			System.out.println();

			double avg = list.stream()
							.map(p -> p.getPrice())
							.reduce(0.0, (x,y) -> x + y / list.size());
			System.out.println("Average price:" + String.format("%.2f", avg));
			
			Comparator<String> comp = (x,y) -> x.toUpperCase().compareTo(y.toUpperCase());
			
			
			System.out.println();
			List<String> names =  list.stream()
									.filter(p -> p.getPrice() < avg)
									.map(p -> p.getName())
									.sorted(comp.reversed())
									.collect(Collectors.toList());
			for(String s : names) {
				System.out.println(s);
			}
					
		}catch(IOException e) {
			System.out.println("Erro :" + e.getMessage());
		}
	}
}
