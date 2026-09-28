package factory.method;

public abstract class NotificadorFactory {
	  // Factory Method
    public abstract Notificacao criarNotificacao();

    public void processarNotificacao(String mensagem) {
        Notificacao not = criarNotificacao();
        not.enviar(mensagem);
    }

}
