package exemplo;
import singleton.Singleton;
public class Exemplo2 {
	public void somar() {
		Singleton singleton = Singleton.getInstance();
		singleton.contar();
	}
}
