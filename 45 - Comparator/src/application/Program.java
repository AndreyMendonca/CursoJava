package application;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();

		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		list.add(new Product("Tablet", 400.00));

		Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

		list.sort(comp);
		for (Product p : list) {
			System.out.println(p);
		}
		
		//usando a classe criado no aplication, ambas funcionam. 
		list.sort(new MyComparator());
		for (Product p : list) {
			System.out.println(p);
		}

	}
}
