package exercicio;

import java.util.Calendar;
import java.util.Date;

public abstract class Funcionario {
	private String nome;
	private double salario; 
	private int tipoFuncionario;
	private Calendar dataUltimasFerias;
	private Date dataUltimasFerias2;
	
	public abstract double calcularBonus();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(int tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}

	public Calendar getDataUltimasFerias() {
		return dataUltimasFerias;
	}

	public void setDataUltimasFerias(Calendar dataUltimasFerias) {
		this.dataUltimasFerias = dataUltimasFerias;
	}

	public Date getDataUltimasFerias2() {
		return dataUltimasFerias2;
	}

	public void setDataUltimasFerias2(Date dataUltimasFerias2) {
		this.dataUltimasFerias2 = dataUltimasFerias2;
	}

}
