package adapter;

public class PrincipalAdapter {

	public static void main(String[] args) {
		// Licença poetica
		int bancoCliente = 0;
		double valorPix = 250.00;
		// Licença poetica
		
		PixGenerico pix=null;
		switch(bancoCliente) {
		case 0 : pix = new PixGenericoBradesco(); break;
		case 1 : pix = new PixGenericoItau(); break;
		default: pix = new PixGenericoSantander();
		}
		pix.pixFeliz(valorPix);
	}

}
