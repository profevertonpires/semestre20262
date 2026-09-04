package exemplo;
import singleton.Singleton;
public class Exemplo1 {
	public void dividir() {
		Singleton singleton = Singleton.getInstance();
		singleton.contar(); 
	}
}
