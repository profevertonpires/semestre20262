package prototype;

public class Contrato implements Documento {
	private String tipo;
	private String conteudo;

	public Contrato(String tipo, String conteudo) {
		this.tipo = tipo;
		this.conteudo = conteudo;
		// Simulação de criação pesada (ex: conexão DB)
		System.out.println("Criando protótipo complexo de " + tipo);
	}

	

	public void exibir() {
		System.out.println(tipo + " - Conteúdo: " + conteudo);
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Documento clonar() {
		try {
			return (Contrato) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}



	public String getTipo() {
		return tipo;
	}



	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public String getConteudo() {
		return conteudo;
	}

}
