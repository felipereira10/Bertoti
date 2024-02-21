package escola;

public class Professor {
	
	private String nome;
	private String cargo;
	private String endereco;
	private String email;


	
	public Professor(String nome, String endereco, String email, String cargo) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.cargo = cargo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public void imprimirProfessor() {
		System.out.println("Nome: " +nome);
		System.out.println("Cargo: " +cargo);
		System.out.println("Endereco: " +endereco);
		System.out.println("Email: " +email);

	}
}
