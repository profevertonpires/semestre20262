package exemplos;

import builder.Pessoa;
import prototype.Contrato;
import prototype.Documento;

public class MainhaBuilder {

	public static void main(String[] args) {

		Pessoa p = new Pessoa.Builder()
				.cpf("13465")
				.nome("Size da Silva")
				.build();
		
		String nome = p.getNome();
		System.out.println(nome);
		
		Professor prof1 = new Professor();
		
		
		Professor prof2 = prof1;
		
		// alteracoees em prof1
		
		// alteracoees em prof1
		
		if ( ! prof1.getNome().equalsIgnoreCase(prof2.getNome()) ) {
			// teve alteração
		}
		
		Documento c1 = new Contrato("tipo", "outra coisa");
		
		Documento c2 = c1.clonar();
		
		c1.setConteudo("Mesma coisa");
		
		System.out.println(c1.getConteudo());
		System.out.println(c2.getConteudo());
		
		
		
		
		


		
		
		
		
		
		
		
		
	}

}
