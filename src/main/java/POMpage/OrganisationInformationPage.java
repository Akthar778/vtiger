package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationInformationPage {

	@FindBy(xpath = "(//input[@title='Edit [Alt+E]'])[1]")
	private WebElement editbtn;
	
	@FindBy(xpath = "(//input[@title='Duplicate [Alt+U]'])[1]")
	private WebElement duplicatebtn;
	
	@FindBy(xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deletebtn;
	
	
	public OrganisationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getEditbtn() {
		return editbtn;
	}


	public WebElement getDuplicatebtn() {
		return duplicatebtn;
	}


	public WebElement getDeletebtn() {
		return deletebtn;
	}
	
	
	
}
