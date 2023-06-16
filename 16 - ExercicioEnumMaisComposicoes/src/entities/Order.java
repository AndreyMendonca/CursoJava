package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private Client client;
	List<OrderItem> items = new ArrayList<>();
	
	public Order() {
		
	}

	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	public void removeItem(OrderItem item) {
		items.add(item);
	}
	public Double total() {
		Double price = 0.0;
		for(OrderItem oi : items) {
			price += oi.subTotal(); 
		}
		return price;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();	
		sb.append("Order moment: ");
		sb.append(moment + "\n");
		sb.append("Order status: ");
		sb.append(status + "\n");
		sb.append("Client: ");
		sb.append(client.getName() + " ");
		sb.append(client.getBithDate() + " - ");
		sb.append(client.getEmail() + "\n");
		sb.append("Order Itens: \n");
		for(OrderItem oi : items) {
			sb.append(oi + "\n");
		}
		return sb.toString();
	}
	
}
