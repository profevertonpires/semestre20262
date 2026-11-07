package judasProject;

public class Pessoa {
	public String nome;
	public Integer idade;
	
	public void sorrir() {
System.out.println("Pessoa");
	}
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome
			, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

}
