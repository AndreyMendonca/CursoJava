package application;

import java.util.Date;

import entities.Order;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) {
		Order o1 = new Order(1082, new Date(), OrderStatus.DEVILERED);
		System.out.println(o1);
		
		OrderStatus os1 = OrderStatus.PROCESSING;
		
		OrderStatus os2 = OrderStatus.valueOf("PROCESSING");
		System.out.println(os1);
		System.out.println(os2);
		
	}
}
