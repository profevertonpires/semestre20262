package adapter;
public class PixGenericoItau implements PixGenerico{
	@Override
	public void pixFeliz(double valor) {
		ItauPix pix = new ItauPix();
		pix.vaiPix(valor, 0);
	}
}
