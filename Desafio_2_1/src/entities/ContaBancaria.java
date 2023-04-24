package entities;

public class ContaBancaria {

	// atributos privados 
	private String cliente;
	private int numConta;
	private double saldo;
	
	// construtor vazio, caso o programador não queira retonar nenhum argumento
	public ContaBancaria() {
	}
	
	// construtor retornando dois argumentos sem o saldo, caso o cliente opte por não iniciar com uma quantia
	public ContaBancaria(String cliente, int numConta) {
		this.cliente = cliente;
		this.setNumConta(numConta);
	}

	//construtor retornando dois argumentos sem o saldo, caso o cliente opte por  iniciar com uma quantia
	public ContaBancaria(String cliente, int numConta, double saldo) {
		this.cliente = cliente;
		this.setNumConta(numConta);
		this.saldo = saldo;
	}
	
	// construtor com o método depositar chamando o argumento quantiaInicial
	public ContaBancaria(String cliente, double numeroConta, double quantiaInicial) {
		this.cliente = cliente;
		this.setNumConta(numConta);
		depositar(quantiaInicial);
	}

	//métodos getters e setters
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
	
	//método sacar 
	public void sacar(double quantia) {
		if ((saldo - quantia) >= 0) {
			saldo -= quantia;
		}
		else {
			System.out.println("Saldo Insuficiente!");
		}
	}
	
	//método depositar
	public void depositar(double quantia) {
		saldo += quantia;
	}
	
	//método toString retornando uma representação string de um objeto
	public String toString() {
		return "Conta : " +  getNumConta() + ", Cliente: " + cliente + ", Saldo:R$ " + String.format("%.2f", saldo);
	}

	
}
