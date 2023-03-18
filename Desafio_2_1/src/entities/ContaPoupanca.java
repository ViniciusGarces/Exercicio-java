package entities;

public class ContaPoupanca extends ContaBancaria {

	private double saldoPoupanca;
	
	public ContaPoupanca() {
	}

	public ContaPoupanca(String cliente, int numConta, double saldoPoupanca) {
		super(cliente, numConta);
		this.saldoPoupanca = saldoPoupanca;
	}

	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	public void calcularNovoSaldo(int qtdDias) {
		saldoPoupanca = (saldoPoupanca * 0.005)* qtdDias + saldoPoupanca;
	}
	
	public String toString() {
		return "Conta : " +  getNumConta() + ", Cliente: " + getCliente() + ", Saldo da Poupanca:R$ " + String.format("%.2f", saldoPoupanca);
	}
}
