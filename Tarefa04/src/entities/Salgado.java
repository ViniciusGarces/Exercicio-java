package entities;

public class Salgado extends Comida {

	//atributo
	private String tipo;
	
	//construtor sem argumentos
	public Salgado() {
	}

	//construtor com argumentos
	public Salgado(String nomeComida, double preco, String tipo) {
		super(nomeComida, preco);
		this.tipo = tipo;
	}

	//metodo getter e setter
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	//método que transforma um objeto em uma representaçã em forma de texto
	public String toString() {
		return "Salgado: " + "Tipo: " + tipo;
	}
}
