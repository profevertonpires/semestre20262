package iterator;
import java.util.Iterator;
import java.util.List;
public class Turma implements Iterable<Pessoa>{
	private List<Pessoa> pessoas;
	@Override
	public Iterator<Pessoa> iterator() {
		return pessoas.iterator();
	}
}
