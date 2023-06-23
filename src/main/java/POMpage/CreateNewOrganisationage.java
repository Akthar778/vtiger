package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganisationage {

	@FindBy(name = "accountname")
	private WebElement organisationName;
	
	@FindBy(name = "industry")
	private WebElement industrybtn;
	
	@FindBy(name = "accounttype")
	private WebElement typebtn;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement savebtn;
	
	
	
	public CreateNewOrganisationage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	public WebElement getOrganisationName() {
		return organisationName;
	}



	public WebElement getSavebtn() {
		return savebtn;
	}



	public WebElement getIndustrybtn() {
		return industrybtn;
	}



	public WebElement getTypebtn() {
		return typebtn;
	}
	
	
	
	
	
	
	
}
