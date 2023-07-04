package application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(2,34,4);
		printList(myInts);
		
		List<String> myString = Arrays.asList("Andrey","Maria","Jose");
		printList(myString);
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}

}
