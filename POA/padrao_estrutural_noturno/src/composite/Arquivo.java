package composite;

public class Arquivo implements Component {
	private String name;

	public Arquivo(String name) {
		this.name = name;
	}

	public void showDetails() {
		System.out.println("Arquivo: " + name);
	}

}
