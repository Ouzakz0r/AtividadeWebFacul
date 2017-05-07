package br.com.atividade.controller;

import java.text.DecimalFormat;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.atividade.modelo.Calcs;
import br.com.atividade.modelo.FuncDTO;

@Controller
public class MainController {

	private Calcs calcula = new Calcs();

	@RequestMapping("/home")
	public String home() {
		return "home";

	}

	@RequestMapping("/calcula")
	public ModelAndView calcula(FuncDTO funcionario, RedirectAttributes attributes) {
		ModelAndView model = new ModelAndView("redirect:home");
		DecimalFormat df = new DecimalFormat("0.##");

		double salarioBruto = calcula.calculaBeneficio(funcionario);
		double imposto = calcula.calculaImposto(salarioBruto);
		double salarioLiquido = salarioBruto - imposto;
		String formatBruto = df.format(salarioBruto);
		String formatImposto = df.format(imposto);
		String formatLiquido = df.format(salarioLiquido);

		attributes.addFlashAttribute("salarioBruto", formatBruto);
		attributes.addFlashAttribute("imposto", formatImposto);
		attributes.addFlashAttribute("salarioLiquido", formatLiquido);

		return model;
	}
}
