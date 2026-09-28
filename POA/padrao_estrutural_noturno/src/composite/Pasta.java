package composite;
import java.util.ArrayList;
import java.util.List;
public class Pasta implements Component {
	private List<Component> arquivos = new ArrayList<>();
	public void add(Component component) {
		arquivos.add(component);
	}
	public void showDetails() {
		if (arquivos.size() > 0) {
			System.out.println("Imprimindo dados dos arquivos");

			for (Component item : arquivos) {
				item.showDetails();
			}
		}
	}
}
