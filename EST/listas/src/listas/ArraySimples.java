package listas;

public class ArraySimples {

	private String[] nomes = new String[10];
	private int posicao = 0;
	
	public void listarTodos() {
		for (int i=0; i<nomes.length; i++) {
			System.out.println(nomes[i]);
		}
	}
	
	public int tamanhoLista() {
		return posicao;
	}

	public void remover(int posicao) {
		nomes[posicao-1] = null;
	}

	public void adicionarNomes(String nome) {
		nomes[posicao++] = nome;
	}

	public boolean localizar(String nome) {
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equalsIgnoreCase(nome)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		ArraySimples a = new ArraySimples();
		a.listarTodos();
		
		System.out.println("Tamanho : " + a.tamanhoLista());
		a.remover(5);
		a.adicionarNomes("Judas");
	}
	
	}
