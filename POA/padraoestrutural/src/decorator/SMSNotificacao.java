package decorator;
public class SMSNotificacao implements Notificacao{
	@Override
	public void notificar(String chave, String mensagem) {
		System.out.println("SMS para " + chave);
	}
}
