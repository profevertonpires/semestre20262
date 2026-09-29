package listas;

public class Lista {
	No primeiro;
	No ultimo;
	
	public void adicionar(String elemento) {
		No novoNo = new No(elemento);
		
		if (primeiro == null) {
			primeiro =novoNo;
		}
		
		if (ultimo ==null ) {
			ultimo =novoNo;	
		}else {
			ultimo.proximo = novoNo;
			ultimo  = novoNo;
		}
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

	
	
	
	
	
	
	
	
	
	
}
