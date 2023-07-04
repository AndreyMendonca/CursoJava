package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args) {	
		List<Integer> myInts = Arrays.asList(1,2,3,4);
		List<Double> myDouble = Arrays.asList(1.12,2.3);
		List<Object> myObj = new ArrayList<>();
		
		copy(myInts, myObj);
		printList(myObj);
		
		System.out.println();
		
		copy(myDouble, myObj);
		printList(myObj);
	}
	
	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for(Number number: source) {
			destiny.add(number);
		}
	}
	
	public static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.print(obj + " ");
		}
	}
}
