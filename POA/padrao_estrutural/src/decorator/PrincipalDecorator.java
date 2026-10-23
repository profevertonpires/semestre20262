package decorator;
public class PrincipalDecorator {
	
	public static void main(String[] args) {
		
		/*
		NotificacaoEmailPadrao notificar 
		  =  new NotificacaoEmailPadrao();
		notificar.enviarEmail();
		*/
		
		Notificar notificar = new Notificar(
				new EmailNotificacao());
		notificar.notificar("Mensagem ");
		
	}
}
