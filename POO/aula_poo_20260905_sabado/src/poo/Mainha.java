package poo;

public class Mainha {

	public static void main(String[] args) {

		HomemAranha andrew = new HomemAranha();
		andrew.setFraqueza("Gwen Stacy");
		andrew.lancarTeia();

		Hulk mark = new Hulk();
		mark.setNome("Bruce Banner");
		mark.setFraqueza("Bety Ross");
		mark.esmaga();

		// utilização dos conceitos de herança
		int escolherHeroi = 0; // licença poetica
		Heroi heroi;					//Classe mãe

		if (escolherHeroi == 0) {		// escolha do cliente
			heroi = new HomemAranha();	// classe que herda Heroi
		} else {
			heroi = new Hulk();			// classe que herda Heroi
		}
		heroi.lancarPoder();			// método da classe heroi

		// cast - trasnformar objetos em outros tipos possíveis
		HomemAranha h = (HomemAranha)heroi;
		h.lancarTeia();
		
		// Utilizando interface
		InterfaceHeroi heroi2;
		if (escolherHeroi == 0) {
			heroi2 = new HomemFerro();
		}else {
			heroi2 = new DeadPoll();
		}
		heroi2.lancarPoder();
		heroi2.sinalDaVitoria();
		heroi2.sorrisoEnigmatico();

	}

}
//https://github.com/profevertonpires/semestre20262






