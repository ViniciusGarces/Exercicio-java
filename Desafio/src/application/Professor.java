package application;

public class Professor extends Perfil {

	private String disciplina;

	public Professor(String matricula, String nome, String disciplina) {
		super(matricula, nome);
		this.disciplina = disciplina;
	}
	
	public void login() {
		super.login();
		System.out.println("Disciplina: " + this.disciplina);
	}
}
