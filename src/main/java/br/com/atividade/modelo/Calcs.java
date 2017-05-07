package br.com.atividade.modelo;

public class Calcs {

	public double calculaBeneficio(FuncDTO funcionario) {
		double salarioMaisAcrescimo = 0;
		if (funcionario.getCargo().equals("OPERARIO") && (funcionario.getTurnoDeTrabalhor().equals("MATUTINO")
				|| funcionario.getTurnoDeTrabalhor().equals("MATUTINO"))) {

			salarioMaisAcrescimo = funcionario.getSalarioBruto() * 1.005;
			funcionario.setSalarioBruto(salarioMaisAcrescimo);

			return salarioMaisAcrescimo;

		} else if ((funcionario.getCargo().equals("OPERARIO") && funcionario.getTurnoDeTrabalhor().equals("NOTURNO"))
				|| (funcionario.getCargo().equals("GERENTE") && funcionario.getTurnoDeTrabalhor().equals("MATUTINO")
						|| funcionario.getTurnoDeTrabalhor().equals("VESPERTINO"))) {

			salarioMaisAcrescimo = funcionario.getSalarioBruto() * 1.007;
			funcionario.setSalarioBruto(salarioMaisAcrescimo);
			return salarioMaisAcrescimo;

		} else if (funcionario.getCargo().equals("GERENTE") && funcionario.getTurnoDeTrabalhor().equals("NOTURNO")) {

			salarioMaisAcrescimo = funcionario.getSalarioBruto() * 1.010;
			funcionario.setSalarioBruto(salarioMaisAcrescimo);
			return salarioMaisAcrescimo;
		}

		return 100;
	}

	public double calculaImposto(double salarioBruto) {
		double imposto = 0;

		if ((salarioBruto <= 1449.15)) {
			imposto = salarioBruto;
			return imposto - salarioBruto;
		} else if ((salarioBruto >= 1449.16) && (salarioBruto <= 2246.75)) {
			imposto = (salarioBruto * 1.075) - 112.43;
			return imposto - salarioBruto;
		} else if ((salarioBruto >= 2246.76) && (salarioBruto <= 2995.70)) {
			imposto = (salarioBruto * 1.115) - 280.94;
			return imposto - salarioBruto;
		} else if ((salarioBruto >= 2995.71) && (salarioBruto <= 3743.19)) {
			imposto = (salarioBruto * 1.225) - 505.62;
			return imposto - salarioBruto;
		} else if (salarioBruto > 3743.19) {
			imposto = (salarioBruto * 1.275) - 692.78;
			return imposto - salarioBruto;
		}

		return imposto - salarioBruto;
	}

}
