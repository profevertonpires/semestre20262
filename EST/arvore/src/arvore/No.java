package arvore;

public class No {
	private int valor;
	private No esquerda;
	private No direita;

	public No(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}
}
