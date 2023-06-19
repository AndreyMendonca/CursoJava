package entities;

public class Company extends TaxPayer{
	private int numberOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	@Override
	public Double tax() {
		Double retorno;
		if(numberOfEmployees <= 10) {
			retorno = super.getAnualIncome() + (super.getAnualIncome() * 16.00/100.00);
		}else {
			retorno = super.getAnualIncome() + (super.getAnualIncome() * 14.00/100.00);
		}
		return retorno;
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" $");
		sb.append(String.format("%.2f", tax()));
		return sb.toString();
	}
}
