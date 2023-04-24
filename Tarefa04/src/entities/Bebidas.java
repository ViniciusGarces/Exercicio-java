package entities;

public class Bebidas {

	//atributos
	private String tipoBebida;
	private double preco;
	
	//construtor sem argumentos
	public Bebidas() {
	}

	//construtor com argumentos
	public Bebidas(String tipoBebida, double preco) {
		super();
		this.tipoBebida = tipoBebida;
		this.preco = preco;
	}

	//métodos getters e setters
	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreço(double preco) {
		this.preco = preco;
	}
	
	//método que transforma um objeto em uma representação em forma de texto
	public String toString() {
		return "Bebidas: " + "Tipo de Bebidade: " + tipoBebida + ", Preço: " + preco;
	}
	
}
