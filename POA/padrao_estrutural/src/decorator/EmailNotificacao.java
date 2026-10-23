package decorator;

public class EmailNotificacao implements Notificacao{

	@Override
	public void notificar(String mensagem) {
		NotificacaoEmailPadrao email 
		   = new NotificacaoEmailPadrao();
		email.enviarEmail();
	}
	

}
