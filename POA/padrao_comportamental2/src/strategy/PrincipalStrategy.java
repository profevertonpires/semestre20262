package strategy;

public class PrincipalStrategy {

	public static void main(String[] args) {
		// licenca poetica
		int tipoFrete = 0;
		float valorEncomenda=150f;
		// licenca poetica
		
		CalcularFreteStrategy frete;
		switch (tipoFrete) {
			case 1:frete =  new FreteParanaStrategy();
			case 2:frete =  new FreteSaoPauloStrategy();
			default:frete =  new FreteBahiaStrategy();
		}
		frete.calcular(valorEncomenda);


	}

}
