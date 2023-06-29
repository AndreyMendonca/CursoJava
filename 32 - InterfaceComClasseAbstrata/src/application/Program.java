package application;

import entities.AbstractShape;
import entities.Rectangle;
import entities.enuns.Color;

public class Program {
	public static void main(String[] args) {
		AbstractShape rectangle = new Rectangle(Color.RED, 2.0, 3.0);
		System.out.println("Rectangle");
		System.out.println("Color: " + rectangle.getColor());
		System.out.println("Area: " + rectangle.area());
	}
}
