package pilhas;

public class PrincipalPilha {

	public static void main(String[] args) {
	 PilhaEstatica<String> pilha = new PilhaEstatica<>(3);
	 boolean adicionar1 = pilha.push("Judas 1");
	 boolean adicionar2 = pilha.push("Judas 2");
	 boolean adicionar3 = pilha.push("Judas 3");
	 String nome = pilha.pop();
	 String nome2 = pilha.pop();
	 boolean adicionar4 = pilha.push("Judas 4");
	 String nome3 = pilha.pop();
	 boolean adicionar5 = pilha.push("Judas 5");
	 boolean adicionar6 = pilha.push("Judas 6");
	 System.out.println(nome);
	 System.out.println(adicionar1);
	 System.out.println(adicionar2);
	 System.out.println(adicionar3);
	 System.out.println(adicionar4);
	 System.out.println(adicionar5);
	 System.out.println(adicionar6);
	 
	 
	 
	 PilhaEncadeada<String> 
	   pilhas = new PilhaEncadeada<String>();
	 pilhas.push("Judas 6");
	 pilhas.push("Judas 7");
	 pilhas.push("Judas 8");
	 String juju = pilhas.pop();
	 pilhas.push("Judas 9");
	 pilhas.push("Judas 0");
	 System.out.println(juju);
	 
	 
	 
	 
	 
	 
	 
	}

}
