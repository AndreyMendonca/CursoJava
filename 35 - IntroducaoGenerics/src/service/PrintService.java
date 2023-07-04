package service;

import java.util.ArrayList;
import java.util.List;

public class PrintService <T>{
	private List<T> list = new ArrayList<>();
	
	public PrintService() {
	}
	
	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalStateException("Lista is employ");
		}else {
			return list.get(0);
		}
	}
	
	public void print() {
		System.out.print("[");
		if(!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for(int i = 1; i < list.size(); i++) {
			System.out.print(list.get(i));
		}
		System.out.print("]");
	}
	
}
