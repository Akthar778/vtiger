package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "(//a[text()='Leads'])[1]")
	private WebElement leadButton;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement administratorButton;
	
	@FindBy(xpath = "//a[text()='Sign Out']")
	private WebElement signout;

	@FindBy(xpath = "(//a[text()='Organizations'])[1]")
	private WebElement organisationbtn;
	
	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=index']")
	private WebElement contactbtn;
	
	@FindBy(id = "qccombo")
	private WebElement qucikCreateDropdown;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	

	public WebElement getLeadButton() {
		return leadButton;
	}
	
	public WebElement getAdministratorButton() {
		return administratorButton;
	}

	public WebElement getSignout() {
		return signout;
	}
	
	public WebElement getOrganisationbtn() {
		return organisationbtn;
	}



	public WebElement getContactbtn() {
		return contactbtn;
	}



	

	
	
}
