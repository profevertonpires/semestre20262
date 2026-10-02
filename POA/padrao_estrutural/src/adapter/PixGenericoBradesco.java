package adapter;
public class PixGenericoBradesco implements PixGenerico{
	private BradescoPix pix = new BradescoPix();
	@Override
	public void pixFeliz(double valor) {
		pix.pix("Chave", valor);
	}
}
