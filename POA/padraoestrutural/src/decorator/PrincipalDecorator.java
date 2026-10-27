package decorator;

public class PrincipalDecorator {
	
	public static void main(String[] args) {
		//EnviarEmailPadrao ep = new EnviarEmailPadrao();
		//ep.enviarEmail("judas@juju.com", "Vamos nessa");
		
		NotificacaoConcreta notificacao 
		 = new NotificacaoConcreta(new EmailNotificacao());
		
		notificacao.notificar("2345678", "judas");
		
	}
}
