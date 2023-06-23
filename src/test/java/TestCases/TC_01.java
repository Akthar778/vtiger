package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.*;
import POMpage.LoginPage;

public class TC_01 extends baseClass{
    //pass
	@Test
	public void validatingLoginFunctionality() throws IOException {
		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();
		
		home.getLeadButton().click();
		
		lead.getPlusbutton().click();
		
		leadpage.getCompanyName().sendKeys(ppt.readingDataFromPropertiesFile("company"));
		leadpage.getLastName().sendKeys(ppt.readingDataFromPropertiesFile("lastname"));
		leadpage.getSaveButton().click();
	
		
		utility.mouseHoveringOnElement(home.getAdministratorButton());
		home.getSignout().click();
		
	}
	
}
