package factory.method;

public class SMSFactory extends NotificadorFactory {
    public Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }


}
