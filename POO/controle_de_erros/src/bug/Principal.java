package bug;

import java.io.IOException;

public class Principal {
	public static void main(String[] args) {
		Matematica m = new Matematica();
		try {
			Turma t = new Turma();
			t.nomes[11] = "Judas";	
		}catch(ArrayIndexOutOfBoundsException e) {
			String mensagem = e.toString();
			System.out.println("Erro no array" + mensagem);
		}catch(ArithmeticException io) {
			String mensagem = io.toString();
			System.out.println("Erro de matematica" + mensagem);
		}
		System.out.println(m.dividir(10, 0));
		System.out.println(m.dividir(10, 1));
		System.out.println(m.dividir(0, 0));
		System.out.println(m.dividir(0, 10));
	}
}
