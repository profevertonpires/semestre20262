package listas;

public class Lista {
	No primeiro;
	No ultimo;
	
	public void adicionar(String elemento) {
		No novoNo = new No(elemento);
		
		if (primeiro == null) {
			primeiro =novoNo;
		}
		
		if (ultimo !=null ) {
			ultimo.proximo = novoNo;
		}
		ultimo  = novoNo;
	}
	
	public void listar() {
		if (primeiro !=null) {
			No noAtual = primeiro;
			while (noAtual !=null) {
				System.out.println(noAtual.elemento);
				noAtual = noAtual.proximo;
			}
		}
	}
	
	public int total() {
		int qtd = 0;
		if (primeiro !=null) {
			No noAtual = primeiro;
			while (noAtual !=null) {
				qtd++;
				noAtual = noAtual.proximo;
			}
		}
		return qtd;
	}

	
	
	
	
	
	
	
	
	
	
}
