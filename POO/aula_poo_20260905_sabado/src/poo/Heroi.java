package poo;

public abstract class Heroi {
	
	public abstract void lancarPoder();
	
	public void dormir() {
		System.out.println("Ronc ronc ronc");
	}

	private String nomeHeroi;
	private String fraqueza;
	private String nome;
	private int idade;
	private String poder;
	private int altura;

	// retorno de informação
	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		if (altura < 0) {
			System.out.println("altura invalida");
		} else {
			this.altura = altura;
		}

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPoder() {
		return poder;
	}

	public void setPoder(String poder) {
		this.poder = poder;
	}

	public String getNomeHeroi() {
		return nomeHeroi;
	}

	public void setNomeHeroi(String nomeHeroi) {
		this.nomeHeroi = nomeHeroi;
	}

	public String getFraqueza() {
		return fraqueza;
	}

	public void setFraqueza(String fraqueza) {
		this.fraqueza = fraqueza;
	}

}
