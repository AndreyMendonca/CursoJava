package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdt = new SimpleDateFormat("dd/MM/yyy");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of products: ");
		int number = sc.nextInt();
		sc.nextLine();
		List<Product> list = new ArrayList<>();
		
		for(int i = 1; i <= number; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if(ch == 'c') {
				list.add(new Product(name,price));
			}else if(ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdt.parse(sc.next());
				list.add(new UsedProduct(name,price,date));
			}else {
				System.out.print("Customs fee: ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS");
		for(Product p : list) {
			System.out.println(p.priceTag());
		}
		sc.close();
	}
}
