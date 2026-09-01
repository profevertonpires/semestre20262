package aula;

public class PagamentoCartaoDebito implements Pagamento{
	@Override
	public void pagar(Double valor) {
		System.out.println(" Pagou via Cartão Debito");
	}
}
