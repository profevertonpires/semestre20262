package aula;

import java.util.ArrayList;
import java.util.List;

public class Order {

	public List<Item> itens = null;
	
	public Order() {
		itens = new ArrayList<>();
	}
	
	public void addItem(String nome, Double preco) {
		// instanciar item
		Item i = new Item();
		
		// setar valores
		i.setNome(nome);
		i.setPreco(preco);
		
		// adicionar na lista
		itens.add(i);
	}
	

	public Double getTotal() {
		Double total = 0.0;
		for (Item item : itens) {
			total += item.getPreco();
		}
		return total;
	}
}
