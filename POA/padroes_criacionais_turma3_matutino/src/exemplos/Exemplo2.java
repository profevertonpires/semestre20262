package exemplos;

import criacional.Singleton;

public class Exemplo2 {
	public void ler() {
		Singleton singleton = Singleton.getInstance();
		System.out.println(singleton.getContador());
	}
}
