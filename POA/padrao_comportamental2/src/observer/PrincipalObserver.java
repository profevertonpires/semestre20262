package observer;

import java.util.ArrayList;
import java.util.List;

public class PrincipalObserver {

	public static void main(String[] args) {
		
		// licença poetica
		boolean mudouEstado= true;
		String mensagem = "O estado mudou";
		// licença poetica
		
		if (mudouEstado) {
			List<Observer> observer = new ArrayList<Observer>();
			observer.add(new EmailSendoMessage());
			observer.add(new WhatsSendMessage());
			observer.forEach((obs -> {
				obs.sendMessage(mensagem);
			}));
		}
	}
}
