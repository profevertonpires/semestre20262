package aula;

import java.util.ArrayList;

public class Mainha {
	//static Order o;
	public static void main(String[] args) {
		// instanciei a ordem
		//o = new Order();
		
		// instancia da lista de itens
		//o.itens = new ArrayList<>();
		
		// criação dos itens
		//Item i1 = new Item(); i1.setPreco(100.00);
		//Item i2 = new Item(); i2.setPreco(120.00);
		//Item i3 = new Item(); i3.setPreco(154.00);

		// adicionando os itens na lista de itens
		//o.itens.add(i1); o.itens.add(i2); o.itens.add(i3);
		
		//o.addItem("Maçã", 10.0);
		//o.addItem("Pera", 8.0);
		//o.addItem("Laranja", 18.0);
		
		//Double totalPrecos = o.getTotal();
		//System.out.println(totalPrecos);
		OrderController controller = new OrderController();
		controller.addItemtoOrder("Maçã", 10.0);
		controller.addItemtoOrder("Pera", 8.0);
		controller.addItemtoOrder("Laranja", 18.0);
		
		Double totalPrecos = controller.getTotalOrder();
		System.out.println(totalPrecos);
		
		Pagamento p=null;
		
		// entrada de usuario
		int tipoPagamento = 0;
		switch (tipoPagamento) {
		case 0 : p = new PagamentoCartaoCredito(); break; 
		case 1 : p = new PagamentoCartaoDebito(); break;

		case 2 : p = new PagamentoPix(); break;
		}
		
		p.pagar(totalPrecos);
		
		
		
		
		
		
		
		
		
		
	}
}





