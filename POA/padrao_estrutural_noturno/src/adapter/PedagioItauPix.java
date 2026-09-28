package adapter;

public class PedagioItauPix implements PedagioPixInterface{
	@Override
	public void enviarPix(double valor) {
		ItauPix pix = new ItauPix();
		pix.setPix(valor, null);
	}

}
