package strategy;

public class FreteSaoPauloStrategy implements CalcularFreteStrategy{

	@Override
	public void calcular(Float valor) {
		System.out.println("Frete 500 reais");
	}


}
