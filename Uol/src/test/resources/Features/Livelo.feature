#Author: Rafaelm.moreira469@gmail.com



@tag
Feature: Adicionar Produto no carrinho


  @tag1
  Scenario: Validar Produto no carrinho
   Given que acesse a URl "https://www.livelo.com.br/home"
   When  adicionar o item no carrinho
   Then Valido resumo da compra