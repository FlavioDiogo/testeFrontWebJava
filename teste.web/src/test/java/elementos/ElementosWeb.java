package elementos;

import org.openqa.selenium.By;

/**
 * 
 * @author Flavio
 *
 */

public class ElementosWeb {
	
	//clicar no combo select e escolher o "Theme"
	public By clicarCombo = By.id("switch-version-select");
	
	//clicar em add record
	public By clicarAddRecord = By.cssSelector("#gcrud-search-form > div.header-tools > div.floatL.t5 > a");

	//salvar formulário
	public By salvarForm = By.id("form-button-save");
	
	//validação de salvo com sucesso
	public By validarMsgSave = By.id("report-success");
	
	//validação do pop para deletar
	public By validarPopDeletar = By.cssSelector("body > div.container-fluid.gc-container > div.row > div.delete-multiple-confirmation.modal.fade.in.show > div > div > div.modal-body > p.alert-delete-multiple-one");
	
	//validação deletar final
		public By validarDeletarFinal = By.cssSelector("body > div.alert.alert-success.growl-animated.animated.bounceInDown > span:nth-child(4) > p");
	
	//confirmar deletar item
	public By deletarItem = By.cssSelector("body > div.container-fluid.gc-container > div.row > div.delete-multiple-confirmation.modal.fade.in.show > div > div > div.modal-footer > button.btn.btn-danger.delete-multiple-confirmation-button");
	
	//clicar em go back to list
	public By clicarVoltarLista = By.id("save-and-go-back-button");
	
	//clicar em search Customer Name
	public By clicarSearch = By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td:nth-child(3) > input");

	//checkbox para selecinar item para deletar
	public By checkboxItem = By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > tbody > tr:nth-child(1) > td:nth-child(1) > input");

	//botão delete
	public By botaoDelete = By.cssSelector("#gcrud-search-form > div.scroll-if-required > table > thead > tr.filter-row.gc-search-row > td.no-border-left > div.floatL > a");

	
}
