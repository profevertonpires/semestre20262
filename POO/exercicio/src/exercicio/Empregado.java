package exercicio;

public class Empregado extends Funcionario{

	@Override
	public double calcularBonus() {
		double valor = getSalario() * 0.1;
		return valor;
	}

}
