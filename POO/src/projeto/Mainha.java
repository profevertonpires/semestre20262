package projeto;

public class Mainha {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		System.out.println(pessoa);
		
		pessoa = new Pessoa();
		System.out.println(pessoa);
		
		new Pessoa();
		
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = pessoa2;
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		pessoa2 = new Pessoa();
		System.out.println(pessoa2);
		System.out.println(pessoa3);
		pessoa2 = null;
		
	}	

}

