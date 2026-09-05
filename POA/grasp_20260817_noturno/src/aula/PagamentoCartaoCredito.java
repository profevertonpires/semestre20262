package aula;

public class PagamentoCartaoCredito implements Pagamento{
	@Override
	public void pagar(Double valor) {
		System.out.println(" Pagou via Cartão Credito");
	}
}
