package singleton;

public class Singleton {
	private static Singleton instance;
	// Construtor privado impede novas instâncias
	private Singleton() { }
	public static Singleton getInstance() {
		if (instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	
	/* Resolução do problema existente*/
	private int contador = 0;
	
	public void contar() {
		System.out.println(contador++);
	}
	/* Resolução do problema existente*/
	
	
	
	
	
	
	
	
	
}
