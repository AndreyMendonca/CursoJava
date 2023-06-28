package application;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel");
		System.out.print("Modelo do carro: ");
		String vehicle = sc.nextLine();
		System.out.print("Retirada (dd/MM/yyyy hh:mm):  ");
		LocalDateTime star = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.print("Retorno (dd/MM/yyyy hh:mm):   ");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		
		CarRental car = new CarRental(star, finish, new Vehicle(vehicle));
		
		System.out.print("Entre com o preço por hora: ");
		Double pricePerHour = sc.nextDouble();
		System.out.print("Entre com o preço por dia:  ");
		Double pricePerDay = sc.nextDouble();
		
		
		RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
		rentalService.processInvoice(car);
		
		System.out.println();
		System.out.println("FATURA: ");
		System.out.println("Pagamento basico: " + car.getInvoid().getBasicPayment());
		System.out.println("Imposto: " + car.getInvoid().getTax());
		System.out.println("Pagamento Total: " + car.getInvoid().getTotalPayment());
		
		sc.close();
	}
}
