package bug;
public class Matematica {
	public int dividir(int n1, int n2) {
		try {
			int resultado = n1/n2;
			return resultado; 
		}catch(ArithmeticException aritmetic) {
			System.out.println("Corrija os parametros");
		}
		return 0;
	}
}
