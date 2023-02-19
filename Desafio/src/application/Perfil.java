package application;

public class Perfil {

	private String matricula;
	public String nome;
	
	
	public Perfil(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
	}
	
	public void login() {
		System.out.println("Matricula: " + this.matricula);
		System.out.println("Nome: " + this.nome); 
	}
	
	
}
