package decorator;
public class SMSNotificacao implements Notificacao{
	public void notificar(String mensagem) {
		SMS sms = new SMS();
		sms.sendSMS(mensagem);
	}
}
