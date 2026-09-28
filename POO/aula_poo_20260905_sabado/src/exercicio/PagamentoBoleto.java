package exercicio;

public class PagamentoBoleto extends Pagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Pagamento feito via Boleto");
	}

}
