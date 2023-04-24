package entities;

public class Cafe extends Bebidas {

	//atributo
	private String complemento;
	
	//construtor sem argumento
	public Cafe() {
	}

	//construtor com argumento
	public Cafe(String complemento) {
		super();
		this.complemento = complemento;
	}

	//método getter e setter
	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	//método que transforma um onjeto em uma representação em forma de texto
	public String toString() {
		return "Café: " + "Complemento: " + complemento;
	}
}
