package exercicio;

public abstract class Pagamento implements MetodoDePagamento {

	private double valor;

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
 
}
