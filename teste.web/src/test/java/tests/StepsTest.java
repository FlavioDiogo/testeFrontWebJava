package tests;

import elementos.ElementosWeb;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MetodosPaginas;


/**
 * 
 * @author Flavio
 *
 */

public class StepsTest {

	MetodosPaginas metodos = new MetodosPaginas();
	ElementosWeb elementos = new ElementosWeb();
	

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String url) throws InterruptedException {
		metodos.abrirWebBrowser(url);
		metodos.esperaImplicita();

	}

	@When("Acessar a pagina do formulario")
	public void acessar_a_pagina_do_formulario() throws InterruptedException {
		
		metodos.itemCombo();
		metodos.clicar(elementos.clicarAddRecord);
		
	}

	@When("preencher todos os campos corretamente e salvar")
	public void preencher_todos_os_campos_corretamente_e_salvar() throws InterruptedException {
		metodos.preencher();
		metodos.clicar(elementos.salvarForm);
	}

	@Then("devera validar se o formulario foi salvo com sucesso")
	public void devera_validar_se_o_formulario_foi_salvo_com_sucesso() throws InterruptedException {
		Thread.sleep(3000);
		metodos.validarMsgSave(elementos.validarMsgSave, "Your data has been successfully stored into the database. Edit Record or Go back to list");
		metodos.fecharWebBrowser();
		
	}
	
	@When("voltar para pagina dos formularios")
	public void voltar_para_pagina_dos_formularios() throws InterruptedException  {
		Thread.sleep(3000);
		metodos.clicar(elementos.clicarVoltarLista);
	    
	}
	
	@When("pesquisar o formulario desejado")
	public void pesquisar_o_formulario_desejado() throws InterruptedException  {
		metodos.clicar(elementos.clicarSearch);
		metodos.preencherSearch();
	    
	}
	
	@When("deletar um formulario")
	public void deletar_um_formulario() throws InterruptedException  {
		metodos.clicar(elementos.checkboxItem);
	    metodos.clicar(elementos.botaoDelete);
	   	metodos.validarPopDeletar(elementos.validarPopDeletar, "Are you sure that you want to delete this 1 item?");
		metodos.clicar(elementos.deletarItem);

	}

	@Then("devera validar se o formulario foi deletado com sucesso")
	public void devera_validar_se_o_formulario_foi_deletado_com_sucesso() throws InterruptedException  {
		Thread.sleep(3000);
		metodos.validarDeletarFinal(elementos.validarDeletarFinal, "Your data has been successfully deleted from the database.");
	   	metodos.fecharWebBrowser();
	}
}
