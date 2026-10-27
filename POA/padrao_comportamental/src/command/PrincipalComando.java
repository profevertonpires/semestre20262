package command;

public class PrincipalComando {
	public static void main(String[] args) {
		// Licenca poética
		int clickBotao = 0;
		// Licenca poética
		
		Comando comando;
		
		switch (clickBotao) {
		case 0: comando = new Salvar();
		case 1: comando = new Refazer();
		default:comando = new Desfazer();
		}
		comando.executar();
	}
}
 