package adapter;
public class PixGenericoBradesco implements PixGenerico{
	@Override
	public void pixFeliz(double valor) {
		BradescoPix pix = new BradescoPix();
		pix.pix("Chave", valor);
	}
}
