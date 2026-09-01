package aula;

public class Pessoa {
	public Integer idade;
	private String nome;
	public Float altura;
	public Float peso;
	
	
	public Pessoa(String nomePessoa, int idade ) {
		this.nome = nomePessoa;
		this.idade = idade;
	}
	
	public Pessoa() {
		this.idade = 35;
		this.nome = "Maomé";
		this.altura = 1.55f;
		this.peso = 89f;
	}

	public Pessoa(Integer idade, String nome, Float altura, Float peso) {
		this.idade = idade;
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
	}
	
	 
	
	

}
