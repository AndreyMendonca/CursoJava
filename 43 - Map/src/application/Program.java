package application;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();
		
		cookies.put("Name", "Andrey");
		cookies.put("Age", "22 years");
		cookies.put("Email", "andrey@gmail.com");
		
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}
		
		cookies.remove("Email"); // remover elementos
		cookies.put("Email", "andrey@gmail.com");
		cookies.put("Email", "teste@gmail.com"); // nesse caso ele vai sobreescrer o email
		
		System.out.println("Constains 'name' key: " + cookies.containsKey("Name"));
		System.out.println("Size: " + cookies.size());
		
		// -----
		Map<Product, Integer> stock = new HashMap<>();
		
		Product p1 = new Product("TV", 200.0);
		Product p2 = new Product("Notebook", 1000.0);
		Product p3 = new Product("Celular", 600.0);
		
		stock.put(p1, 100);
		stock.put(p2, 90);
		stock.put(p3, 200);
		
		Product ps = new Product("TV", 200.0);
		
		System.out.println("Constrais: TV, 200.0 == " +  stock.containsKey(ps));
		
	}
}
