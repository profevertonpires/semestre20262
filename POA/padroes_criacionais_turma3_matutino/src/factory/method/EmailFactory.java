package factory.method;

public class EmailFactory extends NotificadorFactory {
    public Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}
