package br.com.atividade.modelo;

public class FuncDTO {

	private double salarioBruto;
	private double salarioLiquido;
	private String turnoDeTrabalhor;
	private String cargo;

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		this.salarioLiquido = salarioLiquido;
	}

	public String getTurnoDeTrabalhor() {
		return turnoDeTrabalhor;
	}

	public void setTurnoDeTrabalhor(String turnoDeTrabalhor) {
		this.turnoDeTrabalhor = turnoDeTrabalhor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
