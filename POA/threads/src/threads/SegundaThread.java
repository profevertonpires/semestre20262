package threads;

public class SegundaThread extends Thread {

	private Matricula matricula;

	public SegundaThread(Matricula matricula) {
		this.matricula = matricula;
	}

	public void run() {
  	  for (int i = 0; i < 10; i++) {
		int numero = matricula.getMatricula();
		try {Thread.sleep(500);} catch (Exception e) {}
	  }
	}

}
