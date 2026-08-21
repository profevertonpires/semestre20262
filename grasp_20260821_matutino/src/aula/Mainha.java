package aula;

import java.util.ArrayList;

public class Mainha {

	public static void main(String[] args) {

		OrdemController ordem = new OrdemController();

		ordem.addItemToOrdem("Batata", 10.00);
		ordem.addItemToOrdem("Barata", 11.00);
		ordem.addItemToOrdem("Banana", 12.00);

		double total = ordem.getTotalToOrdem();
		System.out.println(total);

		// licença poética
		int tipoPagamento = 1;
		Pagamento pagamento = null;

		switch (tipoPagamento) {
		case 1:
			pagamento = new PagamentoCredito();break;
		case 2:
			pagamento = new PagamentoDebito();break;
		default:
			pagamento = new PagamentoPix();
		}
		pagamento.pagar(ordem.getTotalToOrdem());

	}

}
