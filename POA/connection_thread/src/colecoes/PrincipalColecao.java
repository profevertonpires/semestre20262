package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrincipalColecao {
	
	public static void main(String[] args) {
		Collection<Pessoa> pessoas = new ArrayList<Pessoa>();
		Pessoa p = new Pessoa();
		Pessoa p2 = new Pessoa();
		pessoas.add(new Pessoa());
		pessoas.add(p);
		pessoas.add(p2);
		pessoas.remove(p);
		int qtd = pessoas.size();
		boolean vazio = pessoas.isEmpty();
		boolean acheiPessoa = pessoas.contains(p);
		boolean acheiPessoa2 = pessoas.contains(p2);
		// laço 
		for (Pessoa px : pessoas) {
			px.getEndereco();
		}
		
		// java 17
		pessoas.forEach((pessoa ->{
			pessoa.getEndereco();
		}));
		
		// ArrayList
		List<Pessoa> pList0 = new ArrayList<Pessoa>();
		ArrayList<Pessoa> pList = new ArrayList<Pessoa>();
		LinkedList<Pessoa> pLinked = new LinkedList<Pessoa>();
		pList.sort(null);
		
		
		Set<String> listaUnica = new HashSet<String>();
		listaUnica.add("Joao");
		listaUnica.add("Joao");
		listaUnica.add("Maria");
		listaUnica.add("JOão");
		listaUnica.add("Lucas");
		listaUnica.add("Judas");
		listaUnica.add("João");
		System.out.println(listaUnica.size());
		
		Map<String, String> mapa 
		    = new HashMap<String, String>();
		
		mapa.put("cpf", "123456789");
		mapa.put("nome", "Judas");
		mapa.put("login", "Judas");
		mapa.put("senha", "123");
		
		String cpf = mapa.get("cpf");
		
		
		
	}
}








