package pom_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatingContactpageClass {
	public WebElement getContactsLink() {
		return ContactsLink;
	}

	public WebElement getCreateContacticon() {
		return CreateContacticon;
	}

	public WebElement getLastnameTf() {
		return lastnameTf;
	}

	public WebElement getAddOrganizationIcon() {
		return addOrganizationIcon;
	}

	public WebElement getOptionsFromOrg() {
		return optionsFromOrg;
	}

	public WebElement getSavebutton() {
		return savebutton;
	}

	public CreatingContactpageClass(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Contacts")
	private WebElement ContactsLink;

	@FindBy(xpath = "//img[@alt='Create Contact...']")
	private WebElement CreateContacticon;

	@FindBy(name = "lastname")
	private WebElement lastnameTf;

	@FindBy(xpath = "(//img[@alt='Select'])[1]")
	private WebElement addOrganizationIcon;

	
	@FindBy(linkText = "Jspider")
	private WebElement optionsFromOrg;
	
	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement savebutton;
}
