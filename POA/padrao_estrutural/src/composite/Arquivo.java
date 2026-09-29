package composite;

public class Arquivo implements Component {
	private String nome;

	public Arquivo(String nome) {
		this.nome = nome;
	}

	@Override
	public void showDetails() {
		System.out.println("Arquivo: " + nome);
	}

}
