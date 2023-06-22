package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath =  sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("Folders");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("Files:");
		for(File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfully: " + success);
		
		
		// Algumas operaç ões com o FILE
		
		System.out.println();
		System.out.println("Enter a folder path: ");
		strPath = sc.nextLine();
		
		File path2 = new File(strPath);
		
		System.out.println("getPath: " + path2.getPath());
		System.out.println("getParent: " + path2.getParent());
		System.out.println("getName: " + path2.getName());
		
		sc.close();
	}

}
