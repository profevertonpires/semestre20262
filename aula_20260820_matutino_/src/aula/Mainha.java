package aula;

import java.util.ArrayList;

public class Mainha {

	public static void main(String[] args) {

		OrderController o = new OrderController();

		o.addItem("Batata", 10.00);
		o.addItem("Barata", 11.00);
		o.addItem("Banana", 12.00);

		double tot = o.getTotal();
		System.out.println(tot);

		// licença poetica
		int tipoPagamento = 0;

		Pagamento pagar = null;
		switch (tipoPagamento) {
		case 1:
			pagar = new PagamentoDebito();
			break;
		case 2:
			pagar = new PagamentoPix();
			break;
		default:
			pagar = new PagamentoCredito();
		}

		pagar.pagar(o.getTotal());

	}

}
