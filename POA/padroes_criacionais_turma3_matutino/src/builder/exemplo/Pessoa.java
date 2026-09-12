package builder.exemplo;

public class Pessoa {
	private String nome;
	private String endereco;
	private String cidade;
	private String estado;
	private Integer idade;
	private Integer altura;

	private Pessoa(Builder builder) {
		this.nome = builder.nome;
		this.endereco = builder.endereco;
		this.cidade = builder.cidade;
		this.estado = builder.estado;
		this.idade = builder.idade;
		this.altura = builder.altura;
	}

	// gets e sets
	public static class Builder {
		private String nome;
		private String endereco;
		private String cidade;
		private String estado;
		private Integer idade;
		private Integer altura;

		public Builder nome(String nome) {
			this.nome=nome;
			return this;
		}
		public Builder endereco(String endereco) {
			this.endereco=endereco;
			return this;
		}
		
		public Builder cidade(String cidade) {
			this.cidade=cidade;
			return this;
		}
		
		public Builder estado(String estado) {
			this.estado=estado;
			return this;
		}
		
		public Builder idade(int idade) {
			this.idade=idade;
			return this;
		}
		
		public Builder altura(int altura) {
			this.altura=altura;
			return this;
		}
		public Pessoa build() {
			return new Pessoa(this);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Integer getAltura() {
		return altura;
	}

	public void setAltura(Integer altura) {
		this.altura = altura;
	}
}


