package aula;

import java.util.ArrayList;
import java.util.List;

public class Ordem {
	
	private List<Item> itens = new ArrayList<Item>();
	public void addItem(String nome, Double preco) {
		Item item = new Item();
		item.setNome(nome);
		item.setPreco(preco);
		itens.add(item);
	}
	public Double getTotal() {
		Double total = 0.0;
		for (Item i : itens) {
			total+= i.getPreco();
		}
		return total;
	}
}
