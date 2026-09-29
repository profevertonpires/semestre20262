package composite;

public class PrincipalComposite {

	public static void main(String[] args) {
		Arquivo a1 = new Arquivo("A1");
		Arquivo a2 = new Arquivo("A2");
		Arquivo a3 = new Arquivo("A3");
		Arquivo a4 = new Arquivo("A4");
		Pasta p1 = new Pasta();
		p1.add(a1);	p1.add(a2);	p1.add(a3);	p1.add(a4);
		Arquivo a5 = new Arquivo("A5");
		Arquivo a6 = new Arquivo("A6");
		Arquivo a7 = new Arquivo("A7");
		Pasta p2 = new Pasta();
		p2.add(a5);p2.add(a6);p2.add(p1);p2.add(a7);
		p2.showDetails();
	}

}
