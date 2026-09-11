package abstracty.factory;
public class MainhaAbstractFactory {
	public static void main(String[] args) {
		String os = System.getProperty("os.name").toLowerCase();
		GUIFactory factory;

		if (os.contains("win")) {
			factory = new WindowsFactory();
		} else {
			factory = new MacFactory();
		}

		Application app = new Application(factory);
		app.paint(); // Saída consistante com o sistema operacional
	}
}
