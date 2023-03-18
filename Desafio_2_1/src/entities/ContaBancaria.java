package entities;

public class ContaBancaria {

	private String cliente;
	private int numConta;
	private double saldo;
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(String cliente, int numConta) {
		this.cliente = cliente;
		this.setNumConta(numConta);
	}

	public ContaBancaria(String cliente, int numConta, double saldo) {
		this.cliente = cliente;
		this.setNumConta(numConta);
		this.saldo = saldo;
	}
	
	public ContaBancaria(String cliente, double numeroConta, double quantiaInicial) {
		this.cliente = cliente;
		this.setNumConta(numConta);
		depositar(quantiaInicial);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public void sacar(double quantia) {
		if ((saldo - quantia) >= 0) {
			saldo -= quantia;
		}
		else {
			System.out.println("Saldo Insuficiente!");
		}
	}
	
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	public String toString() {
		return "Conta : " +  getNumConta() + ", Cliente: " + cliente + ", Saldo:R$ " + String.format("%.2f", saldo);
	}

	
}
