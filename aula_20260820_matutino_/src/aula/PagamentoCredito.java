package aula;

public class PagamentoCredito implements Pagamento{

	@Override
	public void pagar(Double valor) {
		System.out.println("Pagou via Credito");
		
	}


}
