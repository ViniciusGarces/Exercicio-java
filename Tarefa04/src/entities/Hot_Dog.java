package entities;

public class Hot_Dog extends Comida {

	// atributos da classe Hot_Dog
	private String molho;
	private String complemento;
	
	// construtor sem argumentos
	public Hot_Dog() {
	}

	//construtor com dois argumentos
	public Hot_Dog(String nomeComida, double preco, String molho, String complemento) {
		super(nomeComida, preco);
		this.molho = molho;
		this.complemento = complemento;
	}

	//metodos getter e setter;
	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	//transforma o objeto em uma representação em forma de texto
	public String toString() {
		return " Hot Dog: " + "Molho: " + molho + ", Complemento: " + complemento;
	}
}
