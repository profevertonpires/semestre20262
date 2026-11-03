package strategy;

public class FreteBahiaStrategy implements CalcularFreteStrategy{

	@Override
	public void calcular(Float valor) {
		System.out.println("Frete 100 reais");
	}

}
