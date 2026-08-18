package aula;

public class PagamentoCredito implements Pagamento{
	@Override
	public void pagar(double valor) {
		System.out.println("Pagou em credito");
	}

}
