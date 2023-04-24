package entities;

public class ContaPoupanca extends ContaBancaria {

	// atributo privado
	private double saldoPoupanca;
	
	//construtor com nenhum argumento
	public ContaPoupanca() {
	}

	//construtor com 3 argumentos
	public ContaPoupanca(String cliente, int numConta, double saldoPoupanca) {
		super(cliente, numConta);
		this.saldoPoupanca = saldoPoupanca;
	}

	//método getter e setter
	public double getSaldoPoupanca() {
		return saldoPoupanca;
	}

	public void setSaldoPoupanca(double saldoPoupanca) {
		this.saldoPoupanca = saldoPoupanca;
	}
	
	//método que realiza o o cálculo do novo saldo da poupança em relação aos dias 
	public void calcularNovoSaldo(int qtdDias) {
		saldoPoupanca = (saldoPoupanca * 0.005)* qtdDias + saldoPoupanca;
	}
	
	//método toString retornando uma representação string de um objeto
	public String toString() {
		return "Conta : " +  getNumConta() + ", Cliente: " + getCliente() + ", Saldo da Poupanca:R$ " + String.format("%.2f", saldoPoupanca);
	}
}
