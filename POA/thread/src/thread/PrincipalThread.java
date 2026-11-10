package thread;

public class PrincipalThread {
	public static void main(String[] args) {
		
		Contador c =  new Contador();
		
		LeitorThread l1 = new LeitorThread(c);
		LeitorThread l2 = new LeitorThread(c);
		
		l1.start();
		l2.start();
		
		
		
		/*
		MinhaThread t = new MinhaThread();
		t.start();

		Thread t2 = new Thread(new MinhaRunnable());
		t2.start();

		new Thread(new Corrida("Carro 1")).start();
		new Thread(new Corrida("Carro 2")).start();
		*/

	}
}
