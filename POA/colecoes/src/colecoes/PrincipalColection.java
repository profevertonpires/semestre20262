package colecoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;

public class PrincipalColection {

	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("Judas");
		c1.add("Maria");
		c1.add("jose");
		c1.add("Pedro");
		c1.remove("Maria");
		int qtd = c1.size();
		boolean estaVazio = c1.isEmpty();
		boolean temString = c1.contains("Maria");
		
		c1.forEach(info ->{
			System.out.println(info);
		});
		
		Collection<Pessoa> p1 = new ArrayList<Pessoa>();
		p1.add(new Pessoa());
		p1.add(new Pessoa());
		Pessoa p3 = new Pessoa();
		p1.add(p3);

		p1.forEach(p -> {
			System.out.println(p.getId());
		});
		
		
		
		
		List<String> l1 = new ArrayList<String>();
		l1.add("Judas");
		l1.add("Maria");
		l1.add("jose");
		String dado = l1.get(0);
		
		List<String> l2 = new LinkedList<String>();
		l2.add("Judas");
		l2.add("Maria");
		l2.add("jose");
		String dado2 = l2.get(1);
		
		Set<Integer> n1 = new HashSet<Integer>();
		n1.add(10); n1.add(0);	n1.add(8);
		n1.add(5);	n1.add(1);	n1.add(10);
		n1.add(1);
		System.out.println(n1);
		
		Set<Integer> n2 = new TreeSet<Integer>();
		n2.add(10);	n2.add(0);	n2.add(8);
		n2.add(5);	n2.add(1);	n2.add(10);
		n2.add(1);
		System.out.println(n1);
		
		Queue<String> f1 = new LinkedList<String>();
		f1.add("Judas");
		f1.add("Maria");
		f1.add("jose");
		String proximo = f1.peek();
		String atender = f1.poll();
		
		PriorityQueue<String> f2 = new PriorityQueue<String>();
		f2.add("Judas");
		f2.add("Maria");
		f2.add("jose");
	}

}
