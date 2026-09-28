package aula;

public class Principal {

	public static void main(String[] args) {
		// regras de negócio
		
		Ordem ordem = new Ordem();
		
		ordem.addItem("Barata", 10.00);
		ordem.addItem("Batata", 11.00);
		ordem.addItem("Banana", 12.00);
		
		// Regras de negócio
		
		FaturamentoOrdem faturamentoOrdem = 
				new FaturamentoOrdem();
		faturamentoOrdem.faturar(ordem);
		
		

		// Calcular imposto 
		
		// Salvar em banco
	}

}
