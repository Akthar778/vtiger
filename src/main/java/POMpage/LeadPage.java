package POMpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadPage {

	public WebElement getLeadAdminstractionButtonHover() {
		return leadAdminstractionButtonHover;
	}
	public WebElement getLeadpagelogout2() {
		return leadpagelogout2;
	}
	
	public WebElement getVallidateduplicateInLeadText() {
		return VallidateduplicateInLeadText;
	}
	public WebElement getLeadCheckBox() {
		return leadCheckBox;
	}
	public WebElement getLeadDeleteButoon() {
		return leadDeleteButoon;
	}
	public WebElement getDuplicateInLeadPage() {
		return VallidateduplicateInLeadText;
	}
	public WebElement getLeadPagecompanyname() {
		return LeadPagecompanyname;
	}
	public WebElement getLeadpageSavebtn() {
		return LeadpageSavebtn;
	}
	public WebElement getLastNameInleadPage() {
		return lastNameInleadPage;
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
	
	public WebElement getPlusbutton() {
		return plusbutton;
	}
	//constructor
	
	public LeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	
	


	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")
	private WebElement plusbutton;
	
	@FindBy(name = "lastname")
	private WebElement lastNameInleadPage;
	
	@FindBy(name = "company")
	private WebElement LeadPagecompanyname;
	
	@FindBy(xpath = "(//input[@title=\"Save [Alt+S]\"])[1]")
	private WebElement LeadpageSavebtn;
	
	@FindBy(xpath = "(//input[@title='Edit [Alt+E]'])[1]")
	private WebElement editbtn;
	
	@FindBy(xpath = "(//input[@title='Duplicate [Alt+U]'])[1]")
	private WebElement duplicatebtn;
	
	@FindBy(xpath = "(//input[@title='Delete [Alt+D]'])[1]")
	private WebElement deletebtn;
		
	@FindBy(xpath = "//span[@class='lvtHeaderText']")
	private WebElement VallidateduplicateInLeadText;
	
	@FindBy(name = "selected_id")
	private WebElement leadCheckBox;
	
	@FindBy(className  = "crmbutton")
	private WebElement leadDeleteButoon;
	
	@FindBy(xpath = "//img[@src='themes/softed/images/user.PNG']")
	private WebElement leadAdminstractionButtonHover;
	
	@FindBy(linkText = "Sign Out")
	private WebElement leadpagelogout2;
	
	
	

	
	
	
	
	
	
}
