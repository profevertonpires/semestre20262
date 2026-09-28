package prototype;

public interface Documento extends Cloneable {
	public Documento clonar();
	public void exibir();
	public void setConteudo(String conteudo);
	public String getConteudo();

}
