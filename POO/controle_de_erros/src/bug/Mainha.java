package bug;

public class Mainha {
	public static void main(String[] args) {
		int n1 = 10;
		int n2 = 0;
		Integer numeros[] = new Integer[10];
		int resposta=0;
		try {
			resposta = n1/n2;	
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

		 
			numeros[19] = resposta;
			numeros[0] = 10;
			numeros[5] = 15;
			int resposta2 = n2/n1;
			System.out.println(resposta2);
		 
		System.out.println("Continuacao");
	}

}
