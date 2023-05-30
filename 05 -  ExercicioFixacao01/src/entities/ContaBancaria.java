package entities;

public class ContaBancaria {
	private int numero;
	private String nome;
	private double valor;
	
	public ContaBancaria(int numero, String nome, double valor) {
		this.numero = numero;
		this.nome = nome;
		this.valor = valor;
	}
	public ContaBancaria(int numero, String nome) {
		this.numero = numero;
		this.nome = nome;
	}
	
	public int getNumero() {
		return numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void adicionarValor(double valor) {
		this.valor += valor;
	}
	public void retirarValor(double valor) {
		this.valor -= (valor+5.00);
	}
	
	public String toString() {
		return " Acconut " + numero + ", Holder: " + nome + ", Balance: $" + String.format("%.2f", valor) ;
	}
}
