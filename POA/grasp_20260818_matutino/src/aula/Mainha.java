package aula;

import java.util.ArrayList;

public class Mainha {
	public static void main(String[] args) {
		 
		OrdemController o =  new OrdemController();

		o.addItem("Batata", 10.0);
		o.addItem("Barata", 0.5);
		o.addItem("Banana", 0.50);
		
		Double valorCompra = o.getTotal();
		System.out.println(valorCompra);
		
		// entrada de usuario
		int tipoPagamento = 1; // digitado pelo usuario
		
		PagamentoController pCon = new PagamentoController();
		boolean x = pCon.pagamento(valorCompra, tipoPagamento );
		if (x) {
			System.out.println("Pagamento realizado");
		}else {
			System.out.println("Erro ao processar pagamento");
		}
		/*
		Pagamento p = null;
		switch (tipoPagamento) {
		case 1 : p = new PagamentoCredito(); break;
		case 2 : p = new PagamentoDebito(); break;
		default : p = new PagamentoDinheiro(); 
		}
		p.pagar(o.getTotal());
		*/
		
		
	}
	
	

}
