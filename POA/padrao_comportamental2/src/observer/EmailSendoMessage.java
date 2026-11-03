package observer;

public class EmailSendoMessage implements Observer {

	@Override
	public void sendMessage(String message) {
		System.out.println("Mensagem enviada Whats");
	}


}
