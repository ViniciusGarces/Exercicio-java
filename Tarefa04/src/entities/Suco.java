package entities;

public class Suco extends Bebidas {

	//atributo
	private String sabor;
	private String complemento;
	
	//construtor sem argumento
	public Suco() {
	}

	//construtor com argumento
	public Suco(String sabor, String complemento) {
		super();
		this.sabor = sabor;
		this.complemento = complemento;
	}

	//método getters e setters
	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	//método que transforma um objeto em uma representação em forma de texto
	public String toString() {
		return "Suco: " + "Sabor: " + sabor + ", Complemento: " + complemento;
	}
}
