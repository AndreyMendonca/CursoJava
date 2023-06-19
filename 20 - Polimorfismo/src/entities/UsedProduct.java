package entities;

import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	
	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.getName());
		sb.append(" (used) ");
		sb.append(" $ " + String.format("%.2f", super.getPrice()));
		sb.append(" (Manufacture date: ");
		sb.append(manufactureDate);
		return sb.toString();
	}
	
}
