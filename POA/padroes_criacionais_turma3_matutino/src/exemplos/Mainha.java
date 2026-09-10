package exemplos;

import factory.method.EmailFactory;
import factory.method.NotificadorFactory;
import factory.method.SMSFactory;

public class Mainha {
	public static void main(String[] args) {
		Exemplo1 exemplo1 = new Exemplo1();
		Exemplo2 exemplo2 = new Exemplo2();
		exemplo1.ler();
		exemplo1.ler();
		exemplo2.ler();
		exemplo1.ler();
		exemplo2.ler();
		NotificadorFactory fabrica;
		int tipoNotificacao = 0;// Entenda esse valor como vindo da tela externa
		// Dados vindo da tela
		if (tipoNotificacao == 0) {fabrica = new EmailFactory();} 
		else { fabrica = new SMSFactory();	}
		fabrica.processarNotificacao("Olá Mundo!");
		


	}

}
