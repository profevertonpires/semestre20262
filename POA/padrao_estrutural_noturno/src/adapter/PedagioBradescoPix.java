package adapter;

public class PedagioBradescoPix implements PedagioPixInterface{
	@Override
	public void enviarPix(double valor) {
		BradescoPix bradescoPix = new BradescoPix();
		bradescoPix.pix(valor, null);
	}
}
