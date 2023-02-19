package application;

public class Sistema {

	public static void main(String[] args) {
		
		
		Aluno aluno = new Aluno("123456", "Maria", 7.5, "Aprovado" );
		aluno.login();
		
		System.out.println();
		Professor prof = new Professor("654321", "João", "Física");
		prof.login();

	}

}
