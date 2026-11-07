package judasProject;

import exercicio1.ContaBancaria;

public class Mainha {

	public static void main(String[] args) {
		 ContaBancaria cb = new ContaBancaria("00124", "Sizenando");
		 cb.depositar(500.00);
		 Double saldo = cb.consultarSaldo();
		 System.out.println(saldo);
		 
	}

}
