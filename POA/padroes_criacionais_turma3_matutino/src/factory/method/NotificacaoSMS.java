package factory.method;

public class NotificacaoSMS implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS : " + mensagem);
    }


}
