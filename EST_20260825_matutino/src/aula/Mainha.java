package aula;

import java.util.ArrayList;
import java.util.List;

public class Mainha {

	public static void main(String[] args) {
		
		Integer notas[] = new Integer[10];
		notas[0]=51; notas[2]=14; notas[3]=154;
		notas[5]=251;notas[4]=154;notas[6]=81;
		notas[7]=91; notas[8]=14; notas[9]=91;
		notas[1]=61;
		
		// impressão de elementos
		for (int i=0; i< notas.length ; i++) {
			System.out.println(notas[i]);
		}
		
		// calculo de média
		Double media =0.0;
		for (int i=0; i< notas.length ; i++) {
			media+=notas[i];
		}
		media = media / notas.length;
		System.out.println(media);
		
		// Contagem de elementos
		int qtd = 0;
		for (int i=0; i< notas.length ; i++) {
			qtd++;
		}
		System.out.println(qtd);
		
		List<Conta> contas = new ArrayList<Conta>();
		
		Conta conta1 = new Conta();
		conta1.agencia = 123;
		conta1.cpf = "000.001.002-34";
		conta1.nomeCliente = "Cremilda Maria";
		conta1.numeroConta = 242411;
		contas.add(conta1);
		
		Conta conta2 = new Conta();
		conta2.agencia = 123;
		conta2.cpf = "001.002.003-45";
		conta2.nomeCliente = "Francisco Maria";
		conta2.numeroConta = 11112424;
		contas.add(conta2);
		
		Conta acheiConta = buscarConta(contas, 11112424);
		System.out.println(acheiConta !=null ? acheiConta.nomeCliente : "Não achei");


	}

	public static Conta buscarConta(List<Conta> contas, Integer numeroConta) {
		for (Conta c : contas) {
			if ( c.numeroConta.compareTo(numeroConta)==0 ) {
				return c;
			}
		}
		return null;
		
	}

}


