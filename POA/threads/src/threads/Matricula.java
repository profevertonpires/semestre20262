package threads;

public class Matricula {
	private int numeroMatricula=0;
	
	public synchronized int getMatricula() {
		numeroMatricula++;
		System.out.println(numeroMatricula);
		return numeroMatricula;
	}

}
