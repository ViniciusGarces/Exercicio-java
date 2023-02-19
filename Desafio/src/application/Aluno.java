package application;

public class Aluno extends Perfil {
 
	private double notaFinal;
	private String situacao;
	
	public Aluno(String matricula, String nome, double notaFinal, String situacao) {
		super(matricula, nome);
		this.notaFinal = notaFinal;
		this.situacao = situacao;
			
		}
	
	public void login() {
		super.login();
		System.out.println("Nota Final: " + this.notaFinal);
		System.out.println("Situação: " + this.situacao);
	}
	
	
}
