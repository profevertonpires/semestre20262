package thread;

public class LeitorThread extends Thread {
	private Contador contador;
	public LeitorThread(Contador contador) {
		this.contador = contador;
	}
	
	public void run() {contarNumero();}
	
	private synchronized void contarNumero() {
		for (int i = 0; i < 1000; i++) {
			try {
				contador.incremento(); Thread.sleep(1000);
			} catch (Exception e) {e.printStackTrace();}
		}
	}
}
