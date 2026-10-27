package decorator;
public class WhatsNotificacao  implements Notificacao{
	@Override
	public void notificar(String chave, String mensagem) {
		System.out.println("Whats para " + chave);
	}
}
