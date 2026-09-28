package bridge;

public class ExecutarJanela extends Desenhar{

	protected ExecutarJanela(ItemInterface janela) {
		super(janela);
	}

	@Override
	void desenharJanela() {
		janela.pintar();
	}

}
