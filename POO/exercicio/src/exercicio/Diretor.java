package exercicio;

import java.util.Calendar;

public class Diretor  extends Funcionario implements Gestao{

	@Override
	public boolean aprovarFerias(Funcionario f) {
		
		f.getDataUltimasFerias().add(Calendar.YEAR, 1);
		Calendar c = Calendar.getInstance();
		
		if (c.after(f)) {
			return true;
		}
		return false;
	}

	@Override
	public double calcularBonus() {
		// TODO Auto-generated method stub
		return getSalario() * 0.2;
	}

}
