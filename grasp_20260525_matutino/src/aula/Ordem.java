package aula;

import java.util.ArrayList;
import java.util.List;

public class Ordem {
	
	private List<Item> itens = new ArrayList<>();
	
	public void addItem(String nome, Double preco) {
		itens.add(new Item(nome, preco));
	}
	
	public Double getTotal() {
		double total = 0.0;
		for (Item i : itens) {
			total+= i.getPreco();
		}
		return total;
	}
	
	
	
	

}
