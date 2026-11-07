package exercicio;

public class Circulo extends FormaGeometrica implements Dimensao{
	

	@Override
	public double getDimensao() {
		return 20;
	}

	@Override
	public double calcularArea() {
		return 150;
	}

}
