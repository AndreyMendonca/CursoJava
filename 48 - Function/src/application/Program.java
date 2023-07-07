package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

import entities.Product;

public class Program {
	public  static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		list.add(new Product("Tablet", 400.00));
		list.add(new Product("Mesa", 20.00));
		
		//interface
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		
		List<String> names = list.stream().map(Product::staticUpperCaseName).collect(Collectors.toList());
		
		
		//expressao lambida
		Function<Product,String> func = p -> p.getName().toUpperCase();
		
		names.forEach(System.out::println);
	}
}
