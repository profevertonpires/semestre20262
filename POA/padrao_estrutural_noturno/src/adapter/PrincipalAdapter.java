package adapter;

public class PrincipalAdapter {

	public static void main(String[] args) {
		// Licenca poética
		int escolhaDoUsuario = 0;
		double valorPix = 250;
		// Licenca poética
		PedagioPixInterface pix = null;

		switch (escolhaDoUsuario) {
		case 0:
			pix = new PedagioBradescoPix();break;
		case 1:
			pix = new PedagioItauPix();break;
		default:
			pix = new PedagioSantanderPix();
		}
		pix.enviarPix(valorPix);
	}

}
