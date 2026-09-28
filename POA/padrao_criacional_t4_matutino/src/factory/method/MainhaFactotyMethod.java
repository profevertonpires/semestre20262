package factory.method;

public class MainhaFactotyMethod {
	public static void main(String[] args) {
		NotificadorFactory fabrica;
		// licença poética
		int tipoNoticicação = 0;
		// Dados vindo da tela
		// Dados vindo da tela
		// Entrada de dados vindo de tela externa
		if (tipoNoticicação == 0) {
			fabrica = new EmailFactory();
		} else {
			fabrica = new SMSFactory();
		}
		fabrica.processarNotificacao("Olá Mundo!");
	}
}
