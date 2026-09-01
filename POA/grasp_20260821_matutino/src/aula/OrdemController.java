package aula;

public class OrdemController {
	Ordem ordem = new Ordem();
	
	public void addItemToOrdem(String nome, Double preco) {
		if (preco <0) {
			System.out.println("Preco invalido");
		}else {	ordem.addItem(nome, preco);	}
	}
	public Double getTotalToOrdem() {
		Double total =ordem.getTotal();
		if (total==null) {	total=0.0;	}
		return total;
	}
}
