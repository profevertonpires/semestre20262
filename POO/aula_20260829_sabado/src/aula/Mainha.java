package aula;

public class Mainha {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Sizenando Silva");
		pessoa.setEstado("Bahia");
		pessoa.setIdade(-10 );
		pessoa.setAltura(-178);
		
		Pai pai = new Pai();
		pai.setNome("Sizenando Silva");
		pai.setEstado("Bahia");
		pai.setIdade(-10 );
		pai.setAltura(-178);
		
		
		
		
		
		
		Pessoa jose = new Pessoa();
		jose.setNome("jose de deos");
		
		Pessoa arnaldo = new Pessoa();
		arnaldo.setNome("Arnaldo Antunes");
		jose.setPai(arnaldo);
		
		Pessoa cremilda = new Pessoa();
		cremilda.setNome("Cremilda Maria");
		jose.setMae(cremilda);
		
		String nome = jose.getNome();
		System.out.println(nome);
		
		String nomePai = jose.getPai().getNome();
		System.out.println(nomePai);
		
		String nomeMae = jose.getMae().getNome();
		System.out.println(nomeMae);
		
		
		
		Pessoa manoel = new Pessoa();
		manoel.setNome("Manoel joaquim");
		
		arnaldo.setPai(manoel);
		
		String nomeAvo = jose.getPai().getPai().getNome();
		System.out.println(nomeAvo);
		
		Pessoa josefa = new Pessoa();
		josefa.setNome("Josefa fofoqueira");
		
		arnaldo.setMae(josefa);
		
		
		String nomeAvoa = jose.getPai().getMae().getNome();
		System.out.println(nomeAvoa);
		josefa = null;
		nomeAvoa = jose.getPai().getMae().getNome();
		System.out.println(nomeAvoa);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		 
			 
	}

}
