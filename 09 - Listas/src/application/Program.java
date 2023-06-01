package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<String> list = new ArrayList<>();
		list.add("Joao");
		list.add("Maria");
		list.add("Wagner");
		list.add("Marco");
		
		System.out.println(list.size());
		for(String l : list) {
			System.out.println(l);
		}
		System.out.println("-------------------");
		list.remove(2);
		for(String l : list) {
			System.out.println(l);
		}
	}
}
