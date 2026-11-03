package observer;

public class WhatsSendMessage implements Observer {

	@Override
	public void sendMessage(String message) {
		System.out.println("Mensagem enviada Whats");
	}

}
