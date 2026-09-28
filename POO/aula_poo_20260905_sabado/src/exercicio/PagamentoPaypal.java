package exercicio;

public class PagamentoPaypal extends Pagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento feito via paypal");
	}

}
