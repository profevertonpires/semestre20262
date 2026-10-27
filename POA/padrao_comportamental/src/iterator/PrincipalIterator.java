package iterator;
public class PrincipalIterator {
	public static void main(String[] args) {
		Turma t = new Turma();
		
		while(t.iterator().hasNext()) {
			Pessoa p = t.iterator().next();
		}
	}
}
