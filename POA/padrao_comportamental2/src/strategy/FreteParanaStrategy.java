package strategy;

public class FreteParanaStrategy implements CalcularFreteStrategy{
	@Override
	public void calcular(Float valor) {
		System.out.println("Frete 250 reais");
	}


}
