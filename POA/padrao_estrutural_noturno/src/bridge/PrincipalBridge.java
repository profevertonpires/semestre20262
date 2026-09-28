package bridge;

public class PrincipalBridge {

	public static void main(String[] args) {
		
		ExecutarJanela executar
			= new ExecutarJanela(new JanelaWindow());
		executar.desenharJanela();
	}

}
