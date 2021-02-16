#Author: Rafael Moreira


Feature: Cadastro 

Background:
Given que acesse o site "http://advantageonlineshopping.com/#/"
  
@Cadastro
Scenario: Realizar Cadastro
When Preencher os  campos de Cadastro  
And Clicar no botao registrar
Then Cadastro sera realizado co sucesso



@Login
Scenario: Realizar Login
When Preencher os dados de Login 
And Clicar em Sign In 
Then Login sera realizado com sucesso
