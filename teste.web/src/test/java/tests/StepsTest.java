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

	@When("buscar o produto Faded Short Sleeve")
	public void buscar_o_produto_faded_short_sleeve() throws InterruptedException {
		metodos.preencher(elementos.pesquisarProduto, "Faded Short Sleeve");
		metodos.clicar(elementos.buscarProduto);
		metodos.clicar(elementos.escolherProduto);
	}

	@When("adicionar no carrinho de compras")
	public void adicionar_no_carrinho_de_compras() throws InterruptedException {
		metodos.clicar(elementos.adcCarrinho);
	}

	@Then("validar se o produto esta dentro do carrinho de compras")
	public void validar_se_o_produto_esta_dentro_do_carrinho_de_compras() throws InterruptedException {
		Thread.sleep(3000);
		metodos.validarProdutoCarrinho(elementos.validarProduto, "Product successfully added to your shopping cart");
		metodos.fecharWebBrowser();
	}

}
