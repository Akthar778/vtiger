package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;
import POMpage.CreateNewOrganisationage;

public class TC_2 extends baseClass {
	//fail
	@Test
	public void OrganisationPageValidation() throws IOException {
		
//		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
//		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
//		login.getLoginclickButton().click();
		home.getOrganisationbtn().click();
		OrgPage.getPlusbtn().click();
		CreatOrgnisationPage.getOrganisationName().sendKeys(ppt.readingDataFromPropertiesFile("OrganisationName"));
		CreatOrgnisationPage.getSavebtn().click();
//		utility.mouseHoveringOnElement(home.getAdministratorButton());
//		home.getSignout().click();
	}

}
