package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatecontactPage {

	

	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement orgPlusBtn;
	
	@FindBy(xpath = "(//tr[@class='lvtColData'])[3]")
	private WebElement existingorgname;
	
	@FindBy(id = "1")
	private WebElement selectExistCompany;
	
	public CreatecontactPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrgPlusBtn() {
		return orgPlusBtn;
	}

	public WebElement getExistingorgname() {
		return existingorgname;
	}
	
	public WebElement getSelectExistCompany() {
		return selectExistCompany;
	}
	
	
}
