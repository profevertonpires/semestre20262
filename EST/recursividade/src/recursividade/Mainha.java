package recursividade;

public class Mainha {

	public static void main(String[] args) {
		Mainha m = new Mainha();
		int fat = m.fatorial(3);
		
		int fib = m.fibonacci(10);
		Integer[] vet1 = new Integer[] {1,1,1,1,2,6};
		int soma = m.somarVetor(vet1);
		int soma2 = m.somarVetor(vet1,6);
		
		System.out.println(soma);
		System.out.println(soma2);
	}
	public int somarVetor(Integer[] vetor) {
		int retorno = 0;
		for (int i =0; i<vetor.length; i++ ) {
			retorno += vetor[i];
		}
		return retorno;
	}
	public int somarVetor(Integer[] vetor, int n) {
	    // Caso base: se o índice é 0, retorna o primeiro elemento
	    if (n <= 0) {
	        return 0;
	    }
	    // Chamada recursiva
	    return somarVetor(vetor, n - 1) + vetor[n - 1];
	}

	
	public int fibonacci(int n) {
	    // Caso base: fib(0)=0, fib(1)=1
	    if (n <= 1) {
	        return n;
	    }
	    // Chamada recursiva
	    return fibonacci(n - 1) + fibonacci(n - 2);
	}
	
	public int fatorial(int n) {
		if (n == 0) {
			return 1;
		}
		return n * fatorial(n - 1);
	}
	

}
