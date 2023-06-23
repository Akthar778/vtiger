package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;
import POMpage.LoginPage;

public class TC_3 extends baseClass {

	@Test
	public void CreateOrgWithTypeAndIndValidation() throws IOException {
		
		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();
		OrgPage.getOrganisationbtn().click();
		OrgPage.getPlusbtn().click();
		CreatOrgnisationPage.getOrganisationName().sendKeys(ppt.readingDataFromPropertiesFile("OrganisationName"));
		utility.handlingDropdown(CreatOrgnisationPage.getIndustrybtn(), "Banking");
		utility.handlingDropdown(CreatOrgnisationPage.getTypebtn(), "Analyst");
		CreatOrgnisationPage.getSavebtn().click();
		
		utility.mouseHoveringOnElement(home.getAdministratorButton());
		home.getSignout().click();
	}
}
