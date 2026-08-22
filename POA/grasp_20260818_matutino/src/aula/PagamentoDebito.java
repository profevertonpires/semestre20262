package aula;

public class PagamentoDebito implements Pagamento{
	@Override
	public void pagar(double valor) {
		System.out.println("Pagou em debito");
	}

}
