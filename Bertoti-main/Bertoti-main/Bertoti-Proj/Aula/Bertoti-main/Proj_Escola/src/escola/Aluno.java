package escola;

public class Aluno {
	
	private String nome;
	private String cpf;
	private String ra;
	
	
	public Aluno(String nome, String cpf, String ra, String endereco, String email) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.ra = ra;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRa() {
		return ra;
	}
	public void setRa(String ra) {
		this.ra = ra;
	}
	
	
	public void imprimirAluno() {
		System.out.println("Nome: " +nome);
		System.out.println("CPF: " +cpf);
		System.out.println("RA: " +ra);
	}
	
	

}
