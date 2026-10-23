package decorator;
public class WhatsNotificacao  implements Notificacao{
	public void notificar(String mensagem) {
		WhatsApp whats = new WhatsApp();
		whats.sendWhats(mensagem, "5571999999999");
	}
}
