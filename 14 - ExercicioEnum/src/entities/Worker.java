package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private WorkerLevel leve;
	private double baseSalary;
	
	private Departament department;
	private List<HourContract> contracts = new ArrayList<>();
	
	public Worker() {
		
	}
	public Worker(String name, WorkerLevel leve, double baseSalary, Departament department) {
		this.name = name;
		this.leve = leve;
		this.baseSalary = baseSalary;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLeve() {
		return leve;
	}
	public void setLeve(WorkerLevel leve) {
		this.leve = leve;
	}
	public double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Departament getDepartment() {
		return department;
	}
	public void setDepartment(Departament department) {
		this.department = department;
	}
	public List<HourContract> getContracts() {
		return contracts;
	}
	
	public void addContract(HourContract contract) {
		contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}
	
	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContract c : contracts) {
			cal.setTime(c.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			if(c_year == year && c_month == month) {
				sum += c.totalValue();
			}
		}
		return sum;
	}
}
