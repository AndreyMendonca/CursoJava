package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import model.service.ProductService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 900.00));
		list.add(new Product("Notebook", 1000.00));
		list.add(new Product("Tablet", 400.00));
		list.add(new Product("Mesa", 20.00));
		
		ProductService ps = new ProductService();
		double sum =  ps.filteredSum(list, p -> p.getPrice() < 500.00);
		System.out.println("Sum price " + sum);
	}
}
