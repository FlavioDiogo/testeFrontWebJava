#Author: flaviomackenzie@gmail.com

@executa
Feature: Acessar o site e preencher o formulario
  Eu como usuario quero acessar o site
  Preencher o formulario
  E validar preenchimento realizado
  
  Background: Estar na home page
  Given que eu esteja no site "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap"

  Scenario: Preencher formulario com sucesso
    When Acessar a pagina do formulario
    And preencher todos os campos corretamente e salvar
    Then devera validar se o formulario foi salvo com sucesso
    
  Scenario: Deletar formulario criado
    When Acessar a pagina do formulario
    And preencher todos os campos corretamente e salvar
    And voltar para pagina dos formularios
 		And pesquisar o formulario desejado
 		And deletar um formulario
    Then devera validar se o formulario foi deletado com sucesso
 		
    
    
    
 
 
    
