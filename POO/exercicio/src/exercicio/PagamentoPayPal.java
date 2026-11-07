package exercicio;

public class PagamentoPayPal  extends Pagamento{

	@Override
	public void processarPagamento(double valor) {
		System.out.println(" Pago via Pay Pal");
	}

}
