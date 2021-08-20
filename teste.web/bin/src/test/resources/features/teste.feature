#Author: flaviomackenzie@gmail.com

@executa
Feature: Acessar o site, pesquisar o produto e adicionar no carrinho de compras
  Eu como usuário quero acessar o site automationpractice.com, para buscar um produto e adicionar no carrinho de compras

Background: Acessar o site
    Given que eu esteja no site "http://automationpractice.com/"
  
  Scenario: Pesquisar produto
    When buscar o produto Faded Short Sleeve
    And adicionar no carrinho de compras
    Then validar se o produto esta dentro do carrinho de compras
    
    
    
 
 
    
