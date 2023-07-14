package practicePom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class practiceContactPom {
	public WebElement getLastName() {
		return lastName;
		
	}

	public practiceContactPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

}
