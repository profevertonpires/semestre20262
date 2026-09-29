package composite;
import java.util.ArrayList;
import java.util.List;

public class Pasta implements Component {
	private List<Component> filhos = new ArrayList<>();

	public void add(Component component) {
		filhos.add(component);
	}

	public void showDetails() {
		for (Component c : filhos) {
			c.showDetails();
		}
	}
}
