package proxy;

public class Pessoa  implements PessoaProxy{
	private String id;
	private String nome;
	private String telefone;
	private String endereco;
	private String idade;
	private String altura;
	private String peso;
	private String situacao;
	private String semCriatividade;
	private String maisCoisa;
	private String soPraConstar;
	private String naoSei;
	private String praComporEspaco;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getAltura() {
		return altura;
	}
	public void setAltura(String altura) {
		this.altura = altura;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public String getSemCriatividade() {
		return semCriatividade;
	}
	public void setSemCriatividade(String semCriatividade) {
		this.semCriatividade = semCriatividade;
	}
	public String getMaisCoisa() {
		return maisCoisa;
	}
	public void setMaisCoisa(String maisCoisa) {
		this.maisCoisa = maisCoisa;
	}
	public String getSoPraConstar() {
		return soPraConstar;
	}
	public void setSoPraConstar(String soPraConstar) {
		this.soPraConstar = soPraConstar;
	}
	public String getNaoSei() {
		return naoSei;
	}
	public void setNaoSei(String naoSei) {
		this.naoSei = naoSei;
	}
	public String getPraComporEspaco() {
		return praComporEspaco;
	}
	public void setPraComporEspaco(String praComporEspaco) {
		this.praComporEspaco = praComporEspaco;
	}
}
