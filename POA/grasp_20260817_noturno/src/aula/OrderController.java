package aula;

public class OrderController {
	
	private Order order;
	public OrderController () {
		order = new Order();
	}
	public void addItemtoOrder(String nome, Double preco) {
		order.addItem(nome, preco);
	}
	public Double getTotalOrder() {
		return order.getTotal();
	}
}
