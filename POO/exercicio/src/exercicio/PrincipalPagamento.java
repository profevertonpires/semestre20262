package exercicio;

public class PrincipalPagamento {

	public static void main(String[] args) {
		// Licença Poetica
		int tipoPagamento = 0;
		// Licença Poetica

		Pagamento p;
		switch (tipoPagamento) {
		case 0:
			p = new PagamentoBoleto();
			break;
		case 1:
			p = new PagamentoCartaoCredito();
			break;
		default:
			p = new PagamentoPayPal();

		}
		
		p.processarPagamento(152);

	}

}
