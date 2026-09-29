package adapter;
public class PixGenericoSantander implements PixGenerico{
	@Override
	public void pixFeliz(double valor) {
		SantanderPix pix = new SantanderPix();
		pix.sendPix(valor, "cpf");
	}
}
