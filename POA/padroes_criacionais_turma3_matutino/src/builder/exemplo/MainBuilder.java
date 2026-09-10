package builder.exemplo;

public class MainBuilder {

	public static void main(String[] args) {
		Pessoa p = new Pessoa
				.Builder()
				.endereco("Casa de mainha")
				.nome("Size")
				.build();
		
		System.out.println(p.getNome());
	}

}
