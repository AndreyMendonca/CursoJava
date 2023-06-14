package application;

import entitites.Account;
import entitites.BusinessAccount;
import entitites.SavingsAccount;

public class Program {
	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		
		//UPCASTING = TODO FILHO PODE SER UM PAI, OU SEJA FAZER O UP PARA SUPERCLASS
		Account acc2 = bacc;
		Account acc3 = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		Account acc4 = new SavingsAccount(1000, "Jorge", 0.0, 0.01);
		
		//DOWNCASTING 
		BusinessAccount bacc2 = (BusinessAccount)acc2;
		
		// forma de fazer downcast tomando cuidado com o tipo de instancias
		if(acc4 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc4;
			acc5.updateBalace();
			System.out.println("Update!!!");
		}
	}
}
