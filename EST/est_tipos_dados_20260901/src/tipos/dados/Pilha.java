package tipos.dados;

public class Pilha {
	private Integer numeros[] = new Integer[2];
	private int posicao=-1;
	public void empilhar(int valor) {
		if (posicao < 1) {
			numeros[++posicao] = valor;
		}else {
			System.out.println("Limite da pilha");
		}
	}
	public Integer desempilhar() {
		if (posicao < 0) {
			System.out.println("Limite da pilha");
			return null;
		}
		return numeros[posicao--];
	}
}
