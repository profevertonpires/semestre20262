package exercicio;

public class PagamentoCartaoCredito  extends Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println(" Pago via Cartao Credito");
	}

}
