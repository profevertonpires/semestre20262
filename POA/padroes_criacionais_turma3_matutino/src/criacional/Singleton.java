package criacional;

public class Singleton {
	
	/* --- Resolucao do problema */
	private int contador = 0;
	public int getContador() {
		return ++contador;
	}
	/* --- Resolucao do problema */
	
	private static Singleton instance;

	private Singleton() {
	}

	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}

}
