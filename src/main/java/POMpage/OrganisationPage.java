package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationPage {

	@FindBy(xpath = "//a[@href='index.php?module=Accounts&action=index']")
	private WebElement organisationbtn;
	
	@FindBy(xpath = "(//input[@value='Delete'])[1]")
	private WebElement deletebtn;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusbtn;
	
	public OrganisationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganisationbtn() {
		return organisationbtn;
	}

	public WebElement getDeletebtn() {
		return deletebtn;
	}

	public WebElement getPlusbtn() {
		return plusbtn;
	}
	
	
	
}
