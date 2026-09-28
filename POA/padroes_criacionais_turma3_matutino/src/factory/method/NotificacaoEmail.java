package factory.method;

public class NotificacaoEmail implements Notificacao {
    public void enviar(String mensagem) {
        System.out.println("Enviando Email: " + mensagem);
    }


}
