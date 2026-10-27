package decorator;

public class NotificacaoConcreta {
	
	private Notificacao notificacao;
	
	public NotificacaoConcreta(Notificacao notificacao) {
		this.notificacao=notificacao;
	}
	
	public void notificar(String value, String mensagem) {
		notificacao.notificar(value, mensagem);
	}

}
