package factory.method;

public abstract class NotificadorFactory {

	public abstract Notificacao criarNotificacao();

    public void processarNotificacao(String mensagem) {
        Notificacao not = criarNotificacao();
        not.enviar(mensagem);
    }


}
