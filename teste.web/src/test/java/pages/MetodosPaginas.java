package pages;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

	public void preencher(){
		WebElement CustomerName = driver.findElement(By.id("field-customerName"));
		CustomerName.sendKeys("Teste Sicredi");
		WebElement ContactLastName = driver.findElement(By.id("field-contactLastName"));
		ContactLastName.sendKeys("Teste");
		WebElement ContactFirstName = driver.findElement(By.id("field-contactFirstName"));
		ContactFirstName.sendKeys("Flávio Luiz Duarte Diogo");
		WebElement Phone = driver.findElement(By.id("field-phone"));
		Phone.sendKeys("51 9999-9999");
		WebElement AddressLine1 = driver.findElement(By.id("field-addressLine1"));
		AddressLine1.sendKeys("Av Assis Brasil, 3970");
		WebElement AddressLine2 = driver.findElement(By.id("field-addressLine2"));
		AddressLine2.sendKeys("Torre D");
		WebElement City = driver.findElement(By.id("field-city"));
		City.sendKeys("Porto Alegre");
		WebElement State = driver.findElement(By.id("field-state"));
		State.sendKeys("RS");
		WebElement PostalCode = driver.findElement(By.id("field-postalCode"));
		PostalCode.sendKeys("91000-000");
		WebElement Country = driver.findElement(By.id("field-country"));
		Country.sendKeys("Brasil");
		WebElement SalesRepEmployeeNumber = driver.findElement(By.id("field-salesRepEmployeeNumber"));
		SalesRepEmployeeNumber.sendKeys("0");
		WebElement CreditLimit = driver.findElement(By.id("field-creditLimit"));
		CreditLimit.sendKeys("200");
			

	}

	public void clicar(By elementos) {
		driver.findElement(elementos).click();
	}

	public void itemCombo() {
		Select select = new Select(driver.findElement(By.id("switch-version-select")));
		select.selectByVisibleText("Bootstrap V4 Theme");
		
	}

	public void esperaImplicita() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public void validarMsgSave(By elementos, String textoEsperado) {
		String texto = driver.findElement(elementos).getText();
		System.out.println("Validar texto, formulário salvo " + texto);
		assertEquals(textoEsperado, texto);
	}

	public void validarPopDeletar(By elementos, String textoEsperado) {
		String texto = driver.findElement(elementos).getText();
		System.out.println("Validar texto, para deletar item " + texto);
		assertEquals(textoEsperado, texto);
	}
	
	public void validarDeletarFinal(By elementos, String textoEsperado) {
		String texto = driver.findElement(elementos).getText();
		System.out.println("Validar texto, para deletar item databse" + texto);
		assertEquals(textoEsperado, texto);
	}
	
	public void preencherSearch() {
		WebElement search = driver.findElement(By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td:nth-child(3) > input"));
		search.sendKeys("Teste Sicredi");

	}	

	public void fecharWebBrowser() {
		driver.quit();

	}

}
