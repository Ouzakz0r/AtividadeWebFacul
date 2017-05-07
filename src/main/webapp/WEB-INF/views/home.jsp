<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<c:url value="/resources/" var="context" />
<link rel="stylesheet" href="${context }bootstrap.min.css">
<title>Atividade</title>
</head>
<body>
	<div class="container">
		<form action="<c:url value='/calcula' />" method="POST"
			class="form-horizontal">
			<fieldset>
				<legend style="text-align: center;">Calcula o salario liquido e imposto</legend>
				<div class="form-group">
					<label class="col-md-4 control-label" for="Salario">Salario:</label>
					<div class="col-md-4">
						<input id="Salario" name="salarioBruto" type="number"
							placeholder="salario bruto" class="form-control input-md">

					</div>
				</div>

				<div class="form-group">
					<label class="col-md-4 control-label" for="turnoDeTrabalho">Turno:
					</label>
					<div class="col-md-4">
						<div class="radio">
							<label for="turnoDeTrabalho-0"> <input type="radio"
								name="turnoDeTrabalhor" id="turnoDeTrabalho-0" value="MATUTINO"
								checked="checked"> MATUTINO
							</label>
						</div>
						<div class="radio">
							<label for="turnoDeTrabalho-1"> <input type="radio"
								name="turnoDeTrabalhor" id="turnoDeTrabalho-1" value="VESPERTINO">
								VESPERTINO
							</label>
						</div>
						<div class="radio">
							<label for="turnoDeTrabalho-2"> <input type="radio"
								name="turnoDeTrabalhor" id="turnoDeTrabalho-2" value="NOTURNO">
								NOTURNO
							</label>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="Cargo">Cargo: </label>
					<div class="col-md-4">
						<label class="radio-inline" for="Cargo-0"> <input
							type="radio" name="cargo" id="Cargo-0" value="GERENTE"
							checked="checked"> Gerente
						</label> <label class="radio-inline" for="Cargo-1"> <input
							type="radio" name="cargo" id="Cargo-1" value="OPERARIO">
							Operario
						</label>
					</div>
				</div>
				<div class="form-group">
					<label class="col-md-4 control-label" for="Confirma">Confirma</label>
					<div class="col-md-4">
						<button id="Confirma" name="Confirma" type="submit"
							class="btn btn-success">Confirma</button>
					</div>
				</div>
			</fieldset>
		</form>
	</div>
	<div class="container">
		<fieldset>
			<table class="table table-bordered table-striped table-hover">
				<tr>
					<td><p>Salario Bruto R$: ${salarioBruto}</p></td>
					<td><p>Salario Liquido R$: ${salarioLiquido}</p></td>
					<td><p>ImpostoR$: ${imposto}</p></td>
				</tr>
			</table>

		</fieldset>


	</div>
</body>
</html>