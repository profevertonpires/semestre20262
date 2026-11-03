package pilhas;

public class PilhaEncadeada<T> {
	private No<T> topo;
	
	public boolean isVazio() {
		return topo==null;
	}
	
	public void push(T elemento) {
		No<T> n = new No<T>();
		n.elemento = elemento;
		n.elementoAbaixo=topo;
		topo = n;
	}
	
	public T pop() {
		T elemento = topo.elemento;
		topo = topo.elementoAbaixo;
		return elemento;
	}
}









