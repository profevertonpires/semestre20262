package exemplos;
import criacional.Singleton;
public class SongletonExemplo2 {

	public void mostrar2() {
		Singleton singleton = Singleton.getInstance();
		int num = singleton.getContador();
		System.out.println(num);
	}

}
