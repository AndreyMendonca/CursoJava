package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product() {
		
	}
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	//metodos gets e sets // encapsulamento
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
}
