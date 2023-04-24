package entities;

public class Pizza extends Comida {

	//atributos
	private String borda;
	private String recheio;
	private String molho;
	
	//construtor sem argumentos
	public Pizza() {
	}

	//construtor com argumentos
	public Pizza(String nomeComida, double preco, String borda, String recheio, String molho) {
		super(nomeComida, preco);
		this.borda = borda;
		this.recheio = recheio;
		this.molho = molho;
	}

	//métodos getters e setters
	public String getBorda() {
		return borda;
	}

	public void setBorda(String borda) {
		this.borda = borda;
	}

	public String getRecheio() {
		return recheio;
	}

	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	//método que transforma um objeto em um representação em forma de texto
	public String toString() {
		return "Pizza: " + "Borda: " + borda + ", Recheio: " + recheio + ", Molho: " + molho;
	}
}
