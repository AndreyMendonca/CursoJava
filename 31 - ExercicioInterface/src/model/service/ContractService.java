package model.service;


import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	private OnlinePaymentService onlinePaymentService;
	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, Integer months) {
		Double valueMonth = contract.getTotalValue() / months;
		for(int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			//juros de cada mes
			Double interest = onlinePaymentService.interest(valueMonth,i);
			Double paymentFee = onlinePaymentService.paymentFee(valueMonth + interest);
			
			Double valueTheEnd = valueMonth + interest + paymentFee;
			
			Installment installment = new Installment(dueDate,valueTheEnd);
			contract.getInstallment().add(installment);
		}
		
	}
}
