package aula;

public class OrdemController {
	
	Ordem o = new Ordem();
	
	public void addItem(String nome, Double preco) {
		o.addItem(nome, preco);
	}
	
	public Double getTotal() {
		return o.getTotal();
	}

}
