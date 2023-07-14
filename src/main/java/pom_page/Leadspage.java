package pom_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leadspage {
	public WebElement getLeadsLink() {
		return leadsLink;
	}

	public WebElement getCreateLeadsButton() {
		return CreateLeadsButton;
	}

	public WebElement getFirstnameTF() {
		return firstnameTF;
	}

	public WebElement getLastnameTF() {
		return lastnameTF;
	}

	public WebElement getCompanynameTF() {
		return CompanynameTF;
	}

	public WebElement getSaveButton() {
		return SaveButton;
	}

	public WebElement getDuplicatebutton() {
		return duplicatebutton;
	}

	public WebElement getDeleteButton() {
		return deleteButton;
	}

	public WebElement getDeleteleadsButton() {
		return deleteleadsButton;
	}

	public Leadspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Leads")
	private WebElement leadsLink;

	@FindBy(xpath = "//img[@alt='Create Lead...']")
	private WebElement CreateLeadsButton;

	@FindBy(name = "firstname")
	private WebElement firstnameTF;

	@FindBy(name = "lastname")
	private WebElement lastnameTF;

	@FindBy(name = "company")
	private WebElement CompanynameTF;

	@FindBy(xpath = "//input[@title='Save [Alt+S]']")
	private WebElement SaveButton;

	@FindBy(xpath = "//input[@title='Duplicate [Alt+U]']")
	private WebElement duplicatebutton;

	@FindBy(xpath = "//input[@title='Delete [Alt+D]']")
	private WebElement deleteButton;

	@FindBy(xpath = "//input[@value='Delete']")
	private WebElement deleteleadsButton;






}
