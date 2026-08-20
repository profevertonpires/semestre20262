package aula;

public class PagamentoDinheiro implements Pagamento{
	@Override
	public void pagar(double valor) {
		System.out.println("Pagou em dinheiro");
	}
}
