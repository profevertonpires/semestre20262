package bridge;
public abstract class Formulario {
	protected Janela janela;
	abstract void crie();
	protected Formulario(Janela janela) {
		this.janela = janela;
	}
}
