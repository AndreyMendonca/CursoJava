package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a file path: ");
		String filePath = sc.nextLine();
		List<Product> list = new ArrayList<>();
		
		File strFilePath = new File(filePath);
		String fileNewFile = strFilePath.getParent();
		boolean success = new File(fileNewFile + "\\out").mkdir();
		System.out.println("Result New File: " + success);
		
		String strNew = fileNewFile + "\\out\\summary.csv";
		
		try(BufferedReader bf = new BufferedReader(new FileReader(filePath))){
			String line = bf.readLine();
			while(line != null) {
			
				String[] fields = line.split(",");
				String name = fields[0];
				Double price = Double.parseDouble(fields[1]);
				Integer quantity = Integer.parseInt(fields[2]);
				list.add(new Product(name, price, quantity));
				
				line = bf.readLine();
			}
			try(BufferedWriter bw = new BufferedWriter(new FileWriter(strNew))){
				for(Product p : list) {
					bw.write(p.getName() + "," + p.getPrice()*p.getQuantity());
					bw.newLine();
				}
			}catch(IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		try(BufferedReader bf = new BufferedReader(new FileReader(strNew))){
			String line = bf.readLine();
			while(line != null) {
				System.out.println(line);
				line = bf.readLine();
			}
		}catch(IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
		
		
		sc.close();
	}
}
