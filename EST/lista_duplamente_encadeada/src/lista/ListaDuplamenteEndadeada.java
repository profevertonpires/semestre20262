package lista;

public class ListaDuplamenteEndadeada {

	No primeiroElemento;
	No ultimoElemento;
	
	public void alterar(int elementoBuscar, int elementoAlterar) {
		if (!isVazio()) {
			No n = ultimoElemento;
			while (n != null) {
				if (n.elemento == elementoBuscar) {
					n.elemento = elementoAlterar;
					n=null;
				}else {
					n = n.anterior;
				}
			}
		}
	}

	public void listar() {
		if (isVazio()) {
			System.out.println("Lista Vazia");
		}else {
			No n = primeiroElemento;
			while(n != null) {
				System.out.println(n.elemento);
				n = n.proximo;
			}
		}

	}

	public void remover(int elemento) {
		if (!isVazio()) {
			
			No n = primeiroElemento;
			while (n!=null) {
				if ( n.elemento == elemento) {
					if (n == primeiroElemento) {
						// lista com 1 elemento
						if ( n==ultimoElemento) {
							primeiroElemento=null;
							ultimoElemento=null;
							n =null;
						}else {
							primeiroElemento= n.proximo;
							n=null;
						}
					}else {
						if ( n==ultimoElemento) {
							ultimoElemento=n.anterior;
							ultimoElemento.proximo =null;
							n=null;
						}else {
							n.anterior.proximo = n.proximo;
							n.proximo.anterior = n.anterior;
							n = null;
						}
					}
					
					
					
					
					
				}
			}
			
		}

	}

	public void adicionar(int elemento) {
		No no = new No();
		no.elemento = elemento;
		
		if (isVazio()) {
			primeiroElemento = no;
		}else {
			no.anterior = ultimoElemento;
			ultimoElemento.proximo = no;
		}
		ultimoElemento = no;
	}

	public boolean isVazio() {
		return primeiroElemento == null;
	}

}
