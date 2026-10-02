package adapter;
public class PixGenericoSantander implements PixGenerico{
	private SantanderPix pix = new SantanderPix();
	@Override
	public void pixFeliz(double valor) {
		pix.sendPix(valor, "cpf");
	}
}
