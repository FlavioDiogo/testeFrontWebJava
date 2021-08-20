package elementos;

import org.openqa.selenium.By;

/**
 * 
 * @author Flavio
 *
 */

public class ElementosWeb {

	// Pesquisar e buscar produto no campo de busca
	public By pesquisarProduto = By.name("search_query");
	public By buscarProduto = By.name("submit_search");

	// Escolher, adicionar e validar produto no carrinho de compras
	public By escolherProduto = By.xpath("//*[@id=\"center_column\"]/ul/li");
	public By adcCarrinho = By.id("add_to_cart");
	public By validarProduto = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");

}
