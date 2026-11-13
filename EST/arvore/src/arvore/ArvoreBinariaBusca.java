package arvore;

import java.util.ArrayList;
import java.util.List;


public class ArvoreBinariaBusca {
	private No raiz;

	public boolean adicionar(int valor) {
		if (pesquisar(valor))
			return false;
		raiz = inserirRecursivo(raiz, valor);
		return true;
	}

	private No inserirRecursivo(No atual, int valor) {
		if (atual == null)
			return new No(valor);
		if (valor < atual.getValor()) {
			atual.setEsquerda(inserirRecursivo(atual.getEsquerda(), valor));
		} else {
			atual.setDireita(inserirRecursivo(atual.getDireita(), valor));
		}
		return atual;
	}

	/** Retorna o nó encontrado ou null se o valor não existir. */
	public No buscar(int valor) {
		No atual = raiz;
		while (atual != null) {
			if (valor == atual.getValor())
				return atual;
			atual = valor < atual.getValor() ? atual.getEsquerda() : atual.getDireita();
		}
		return null;
	}

	/** Retorna true quando o valor está presente na árvore. */
	public boolean pesquisar(int valor) {
		return buscar(valor) != null;
	}

	public boolean remover(int valor) {
		if (!pesquisar(valor))
			return false;
		raiz = removerRecursivo(raiz, valor);
		return true;
	}

	private No removerRecursivo(No atual, int valor) {
		if (atual == null)
			return null;
		if (valor < atual.getValor()) {
			atual.setEsquerda(removerRecursivo(atual.getEsquerda(), valor));
		} else if (valor > atual.getValor()) {
			atual.setDireita(removerRecursivo(atual.getDireita(), valor));
		} else {
			// Caso 1: folha; caso 2: apenas um filho.
			if (atual.getEsquerda() == null)
				return atual.getDireita();
			if (atual.getDireita() == null)
				return atual.getEsquerda();
			// Caso 3: dois filhos. Substitui pelo sucessor em ordem.
			No sucessor = menorNo(atual.getDireita());
			No substituto = new No(sucessor.getValor());
			substituto.setEsquerda(atual.getEsquerda());
			substituto.setDireita(removerRecursivo(atual.getDireita(), sucessor.getValor()));
			return substituto;
		}
		return atual;
	}

	private No menorNo(No atual) {
		while (atual.getEsquerda() != null)
			atual = atual.getEsquerda();
		return atual;
	}

	/** In-order: esquerda, raiz, direita. */
	public List<Integer> emOrdem() {
		List<Integer> resultado = new ArrayList<>();
		emOrdemRecursivo(raiz, resultado);
		return resultado;
	}

	private void emOrdemRecursivo(No atual, List<Integer> resultado) {
		if (atual == null)
			return;
		emOrdemRecursivo(atual.getEsquerda(), resultado);
		resultado.add(atual.getValor());
		emOrdemRecursivo(atual.getDireita(), resultado);
	}

	/** Post-order: esquerda, direita, raiz. */
	public List<Integer> posOrdem() {
		List<Integer> resultado = new ArrayList<>();
		posOrdemRecursivo(raiz, resultado);
		return resultado;
	}

	private void posOrdemRecursivo(No atual, List<Integer> resultado) {
		if (atual == null)
			return;
		posOrdemRecursivo(atual.getEsquerda(), resultado);
		posOrdemRecursivo(atual.getDireita(), resultado);
		resultado.add(atual.getValor());
	}
}
