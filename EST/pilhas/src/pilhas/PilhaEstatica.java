package pilhas;

public class PilhaEstatica<T> {
	private T[] elementos;
	private int topo = -1;

	public PilhaEstatica(int qtd) {
		elementos = (T[]) new Object[qtd];
	}

	public boolean isVazia() {
		return topo < 0;
	}

	public boolean push(T elemento) {
		if (topo != (elementos.length - 1)) {
			elementos[++topo] = elemento;
			return true;
		}
		return false;
	}

	public T pop() {
		if (topo < 0) {
			return null;
		}

		return elementos[topo--];
	}

	// daqui pra frente é só pra trás

	public boolean buscarElemento(T elemento) {
		PilhaEstatica<T> nova = new PilhaEstatica<>(topo);
		T t = this.pop();
		while (t != null) {
			nova.push(t);
			t = this.pop();
		}
		boolean acheiElemento = false;
		T el = nova.pop();
		while (el != null) {
			if (el == elemento) {
				acheiElemento = true;
			}
			this.push(el);
			el = nova.pop();
		}
		return acheiElemento;
	}

}
