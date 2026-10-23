package decorator;
public class Notificar {
	private Notificacao notificacao;
	public Notificar(Notificacao n) {
		this.notificacao = n;
	}
	public void notificar(String mensagem) {
		this.notificacao.notificar(mensagem);
	}
}
