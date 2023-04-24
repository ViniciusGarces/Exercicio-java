package entities;

public class Comida {

	// atributos da classe Comida
	private String nomeComida;
	private double preco;
	
	// construtor sem argumentos 
	public Comida() {
	}
	
	//construtor com dois aegumentos
	public Comida(String nomeComida, double preco) {
		super();
		this.nomeComida = nomeComida;
		this.preco = preco;
	}

	// getters e sertters
	public String getNomeComida() {
		return nomeComida;
	}

	public void setNomeComida(String nomeComida) {
		this.nomeComida = nomeComida;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	//transformar um objeto em representação em forma de texto
	public String toString() {
		return "Comida: " + "Nome: " + nomeComida + ", Preço: " + preco;
	}
}
