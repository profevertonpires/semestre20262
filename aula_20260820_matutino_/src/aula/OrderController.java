package aula;

public class OrderController {
	Ordem ordem = new Ordem();
	
	public void addItem(String nome, Double preco) {
		if (preco<0) {
			System.out.println("Preco invalido");
		}else {
			ordem.addItem(nome, preco);	
		}
	}

	public Double getTotal() {
		return ordem.getTotal();
	}

}
