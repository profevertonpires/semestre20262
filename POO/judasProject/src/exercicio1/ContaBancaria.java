package exercicio1;

public class ContaBancaria {
	private String numero;
	private String titular;
	private Double saldo;
	public ContaBancaria(String numero, String titular) {
		this.numero = numero;
		this.titular = titular;
	}
	public void depositar(double valor) {
	if ( saldo == null) {
		saldo =0.0;
	}
		saldo = saldo + valor;
		//saldo = saldo==null? valor : saldo + valor;
	}
	public void sacar(double valor) {
	}
	public Double consultarSaldo() {
		return saldo;
	}
	
}
