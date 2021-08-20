package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Flavio
 *
 */

public class MetodosPaginas {

	WebDriver driver;

	public void abrirWebBrowser(String site) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void preencher(By elementos, String produto) {
		driver.findElement(elementos).sendKeys(produto);

	}

	public void clicar(By elementos) {
		driver.findElement(elementos).click();

	}

	public void esperaImplicita() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	public void validarProdutoCarrinho(By elementos, String textoEsperado) { 
		 String texto = driver.findElement(elementos).getText(); 
		 System.out.println("Validação de texto, produto no carrinho de compras " + texto);
		 assertEquals(textoEsperado, texto);
	}
	
	public void fecharWebBrowser() {
		driver.quit();

	}

}
