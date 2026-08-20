package aula;

import java.util.ArrayList;
import java.util.List;

public class Ordem {
	
	private List<Item> itens= new ArrayList<>();
	 
	public void addItem(String nome, Double preco) {
		Item i = new Item();
		i.setNome(nome);
		i.setPreco(preco);
		itens.add(i);
	}

	public Double getTotal() {
		double total = 0.0;
		for (Item i : itens) {
			total+= i.getPreco();
		}
		return total;
	}
}
