package threads;

public class PrimeiraThread extends Thread {

	private Matricula matricula;

	public PrimeiraThread(Matricula matricula) {
		this.matricula = matricula;
	}

	public  void run() {
  	  for (int i = 0; i < 10; i++) {
		int numero = matricula.getMatricula();
		try {Thread.sleep(500);} catch (Exception e) {}
	  }
	}

}
