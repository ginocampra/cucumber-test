package br.com.lfchaim.cucumbertest;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalcSteps {

	Calc calc;
	int a, b;
	
	@Given("^que eu escolha somar$")
	public void que_eu_escolha_somar() {
		calc = new Calc();
	}

	@When("^eu preencho o primeiro número com o valor '(\\d+)'$")
	public void eu_preencho_o_primeiro_número_com_o_valor(int arg1) {
		a = arg1;
	}

	@When("^eu preencho o segundo número com o valor '(\\d+)'$")
	public void eu_preencho_o_segundo_número_com_o_valor(int arg1) {
		b = arg1;
	}

	@Then("^eu devo ver o resultado como '(\\d+)'$")
	public void eu_devo_ver_o_resultado_como(int arg1) {
		assertEquals(arg1, calc.somar(a, b));
	}

}
