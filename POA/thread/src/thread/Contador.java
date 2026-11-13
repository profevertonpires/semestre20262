package thread;

public class Contador {
	private int valorNumerico;
	
	public synchronized void incremento() {
		valorNumerico++;
		System.out.println(valorNumerico);
	}

}
