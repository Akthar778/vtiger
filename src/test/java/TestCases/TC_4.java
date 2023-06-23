package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class TC_4 extends baseClass {
    //pass
	@Test
	public void contactsWithMandatoryField() throws IOException {
		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();
		home.getContactbtn().click();
		lead.getPlusbutton().click();
		leadpage.getLastName().sendKeys(ppt.readingDataFromPropertiesFile("lastname"));
		CreatOrgnisationPage.getSavebtn().click();
		utility.mouseHoveringOnElement(home.getAdministratorButton());
		home.getSignout().click();
	}
}
