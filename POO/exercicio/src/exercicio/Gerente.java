package exercicio;

import java.util.Calendar;
import java.util.Date;

public class Gerente  extends Funcionario implements Gestao{

	@Override
	public boolean aprovarFerias(Funcionario f) {
		Date data = f.getDataUltimasFerias2();
		data.setYear(1);
		
		Date hoje = new Date(Calendar.getInstance().getTimeInMillis());
		
		if (hoje.after(data)) {
			return true;
		}
		return false;
	}

	@Override
	public double calcularBonus() {
		// TODO Auto-generated method stub
		return getSalario() * 0.15;
	}

}
