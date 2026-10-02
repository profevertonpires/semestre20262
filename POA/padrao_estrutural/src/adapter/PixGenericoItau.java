package adapter;
public class PixGenericoItau implements PixGenerico{
	private ItauPix pix = new ItauPix();
	@Override
	public void pixFeliz(double valor) {
		pix.vaiPix(valor, 0);
	}
}
