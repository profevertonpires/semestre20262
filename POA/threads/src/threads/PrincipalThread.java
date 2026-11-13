package threads;

public class PrincipalThread {

	public static void main(String[] args) {
		/*
		MinhaThread t = new MinhaThread();
		t.start();
		Thread t2 = new Thread(new MinhaRunnable());
		t2.start();
		
		
		new Thread(new Corrida("Carro 1")).start();
        new Thread(new Corrida("Carro 2")).start();
        new Thread(new Corrida("Carro 3")).start();
        */
		Matricula matricula = new Matricula();
		PrimeiraThread p = new PrimeiraThread(matricula);
		SegundaThread s = new SegundaThread(matricula);
		
		p.start();
		s.start();
		


	}

}
