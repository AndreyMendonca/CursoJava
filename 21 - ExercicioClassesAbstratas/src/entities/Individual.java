package entities;

public class Individual extends TaxPayer{
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public Double tax() {
		Double retorno;
		if(super.getAnualIncome() < 20000.00) {
			retorno = super.getAnualIncome() + (super.getAnualIncome() * 15.00 / 100.00);
			retorno -= healthExpenditures * 50.00/100.00;
		}else {
			retorno = super.getAnualIncome() + (super.getAnualIncome() * 25.00 / 100.00);
			retorno -= healthExpenditures * 50.00/100.00;	
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
