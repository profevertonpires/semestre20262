package aula;

public class PagamentoDebito  implements Pagamento{

	@Override
	public void pagar(Double valor) {
		System.out.println("Pagou via Debito");
	}


}
