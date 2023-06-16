package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number of shapes: ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			char r = sc.next().charAt(0);
			System.out.print( "Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(sc.next());
			Shape shape;
			if(r == 'r') {
				System.out.print("Width: ");
				Double width = sc.nextDouble();
				System.out.print("Height: ");
				Double height = sc.nextDouble();
				shape = new Rectangle(color, width, height);
			}else {
				System.out.print("Radius: ");
				Double radius = sc.nextDouble();
				shape = new Circle(color, radius);
			}
			shapes.add(shape);
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS:");
		for(Shape s : shapes) {
			System.out.println(s.area());
		}
		
		sc.close();
	}
}
