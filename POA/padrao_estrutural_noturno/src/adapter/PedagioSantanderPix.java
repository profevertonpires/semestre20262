package adapter;

public class PedagioSantanderPix implements PedagioPixInterface{
	@Override
	public void enviarPix(double valor) {
		SantanderPix pix = new SantanderPix();
		pix.enviarDados(valor, null);
	}

}
