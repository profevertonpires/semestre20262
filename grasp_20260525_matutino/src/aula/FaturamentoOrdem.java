package aula;

public class FaturamentoOrdem extends Faturamento{
	
	public Double faturar(Ordem ordem) {
		// regras de negócio
		
		
		OrdemRepository ordemRepository = new OrdemRepository();
		ordemRepository.save(ordem);
 
		
		return null;
	}

	@Override
	public Double faturar() {
		// TODO Auto-generated method stub
		return null;
	}

}
