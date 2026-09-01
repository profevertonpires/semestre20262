package aula;

public class Principal {

	public static void main(String[] args) {
		
		Pessoa pessoa= new Pessoa("Cremilda", 63);
		System.out.println(pessoa.idade);
		Pessoa pessoa3= new Pessoa();
		
		pessoa.altura = 1.87f;
		pessoa.idade = 24;
		pessoa.peso = 93f;
		
		Pessoa pessoa2 = pessoa;
		
		pessoa2.idade = pessoa.idade;
		pessoa2.idade = 11;
		
		System.out.println(pessoa.idade);
		System.out.println(pessoa2.idade);
		
		Matematica matematica = new Matematica();
		float x = matematica.calcularMedia(1, 2);
		System.out.println(x);
		
		
		
		
		
		
		

	}

}
