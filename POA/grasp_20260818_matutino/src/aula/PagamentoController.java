package aula;

public class PagamentoController {
	
	public boolean pagamento(double valor, int tipoPagamento) {
		if (valor <=0) return false;
		
		Pagamento p = null;
		switch (tipoPagamento) {
		case 1 : p = new PagamentoCredito(); break;
		case 2 : p = new PagamentoDebito(); break;
		default : p = new PagamentoDinheiro(); 
		}
		p.pagar(valor);
		
		return true;
		
	}

}
