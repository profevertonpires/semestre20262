package decorator;

public class EmailNotificacao  implements Notificacao{
	@Override
	public void notificar(String chave, String mensagem) {
		EnviarEmailPadrao ep = new EnviarEmailPadrao();
		ep.enviarEmail(chave, mensagem);
	}

}
