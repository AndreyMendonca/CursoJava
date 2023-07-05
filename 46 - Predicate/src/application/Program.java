package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product;
import util.ProductPredicate;

public class Program {
	public static void main(String[] args)  {
		List<Product> list = new ArrayList<>();
		// usando expressao lambida
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		list.add(new Product("Tablet", 400.00));
		list.add(new Product("Mesa", 20.00));
		
		list.removeIf(p -> p.getPrice() >= 500);
		for(Product p : list) {
			System.out.println(p);
		}
		
		//Metodo predicato 
		System.out.println();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		
		list.removeIf(new ProductPredicate());
		for(Product p : list) {
			System.out.println(p);
		}
		
		//Metodo por referencia passando onde ele esta, no caso a classe
		System.out.println();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		
		list.removeIf(Product::staticProductPredicate);
		for(Product p : list) {
			System.out.println(p);
		}
		
		//Criando expressao inline
		Predicate<Product> pred = p -> p.getPrice() >= 100.00;
		System.out.println();
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		
		list.removeIf(pred);
		for(Product p : list) {
			System.out.println(p);
		}
		
	}
}
