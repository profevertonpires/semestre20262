package criacional;

public class Singleton {
	private int contador = 0;

	public int getContador() {
		return ++contador;
	}

	private static Singleton instance;

	// Construtor privado impede novas instâncias
	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
