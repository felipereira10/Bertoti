package escola;

public class Principal {
	
	public static void main(String args[]) {
		
	Aluno aluno1 = new Aluno("Maria", "123.456.789-99", "123456", null, null);
	Aluno aluno2 = new Aluno("Felipe", "987.456.123-11", "654321", null, null);
	Aluno aluno3 = new Aluno("Jorge", "987.123.123-22", "547863", null, null);
	Aluno aluno4 = new Aluno("Renata", "987.456.987-77", "998822", null, null);
	
	
	Professor professor = new Professor("Giuliano", "Prof° Engenharia de Software", "Av. das Nacoes", "giuliano@fatec.sp.gov.br");
	
	
	Aula aula = new Aula("1h40", professor);

	aula.adicionaAluno(aluno1);
	aula.adicionaAluno(aluno2);
	aula.adicionaAluno(aluno3);
	aula.adicionaAluno(aluno4);
	aula.imprimirAula();
	}
}
