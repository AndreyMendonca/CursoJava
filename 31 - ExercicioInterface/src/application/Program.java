package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.service.ContractService;
import model.service.PaypalService;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre os dados do contrato:");
		System.out.print("Numero: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(sc.next(),fmt);
		System.out.print("Valor do contrato: ");
		Double totalValue = sc.nextDouble();
		
		Contract contract =  new Contract(number, date, totalValue);
		
		System.out.print("Entre com o numero de parcelas: ");
		int numberInstallments = sc.nextInt();

		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, numberInstallments);
		
		System.out.println();
		System.out.println("PARCELAS");
		for(Installment installment : contract.getInstallment()) {
			System.out.println(installment);
		}
		
		
		
		
		sc.close();
	}
}
