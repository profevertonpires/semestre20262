package exemplos;

import criacional.Singleton;

public class SingletonExemplo1 {
	public void mostrar1() {
		Singleton singleton = Singleton.getInstance();
		int num = singleton.getContador();
		System.out.println(num);
	}
}
