package bridge;

public abstract class Desenhar {
	protected ItemInterface janela;
	
	protected Desenhar(ItemInterface janela) {
		this.janela = janela;
	}
	
	abstract void desenharJanela();

}
