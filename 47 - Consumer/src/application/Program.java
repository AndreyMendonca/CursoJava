package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

import entities.Product;
import util.PriceUpdate;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		list.add(new Product("Tablet", 400.00));
		list.add(new Product("Mesa", 20.00));
		
		
		list.forEach(new PriceUpdate());	
		list.forEach(System.out::println);
		
		list.forEach(Product::staticPriceUpdate);	
		list.forEach(System.out::println);
		
		Double factor = 1.1;
		
		Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);
		
		list.forEach(cons);
		
	}
}
