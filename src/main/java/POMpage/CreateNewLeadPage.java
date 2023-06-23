package POMpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewLeadPage {

	@FindBy(name = "lastname")
	private WebElement lastName;
	
	@FindBy(name = "company")
	private WebElement companyName;
	
	@FindBy(xpath = "(//input[@title='Save [Alt+S]'])[1]")
	private WebElement saveButton;
	
	public CreateNewLeadPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getCompanyName() {
		return companyName;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
	
	
}