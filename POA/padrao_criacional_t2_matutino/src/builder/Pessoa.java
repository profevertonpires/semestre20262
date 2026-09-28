package builder;

public class Pessoa {

	private String nome;
	private String cpf;
	private String filiacao;
	private String endereco;
	private String cidade;
	private String estado;
	private int idade;
	private int altura;

	 

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

	public String getFiliacao() {
		return filiacao;
	}

	public void setFiliacao(String filiacao) {
		this.filiacao = filiacao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	private Pessoa(Builder builder) {
		this.nome = builder.nome;
		this.cpf = builder.cpf;
	}
	
 
	/* Classe faz parte da classe Pessoa */
	public static class Builder {
		private String nome;
		private String cpf;
		public Pessoa build() {
			return new Pessoa(this);
		}
		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}
		public Builder cpf(String cpf) {
			this.cpf = cpf;
			return this;
		}
		
	}

}
