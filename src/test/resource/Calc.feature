#language: en
Feature: Calc
	Como usuario entrar com 2 valores
	Com objetivo de obter um resultado
	
	Scenario: Somar
	Given que eu escolha somar
	When eu preencho o primeiro número com o valor '1'
	And eu preencho o segundo número com o valor '1'
	Then eu devo ver o resultado como '2'
	
	