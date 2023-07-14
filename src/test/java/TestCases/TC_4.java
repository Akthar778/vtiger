package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class TC_4 extends baseClass {
    //pass
	@Test
	public void contactsWithMandatoryField() throws IOException {
		
		home.getContactbtn().click();
		lead.getPlusbutton().click();
		leadpage.getLastName().sendKeys(ppt.readingDataFromPropertiesFile("lastname"));
		CreatOrgnisationPage.getSavebtn().click();
		
	}
}
