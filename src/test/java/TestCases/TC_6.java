package TestCases;

import static org.testng.Assert.assertEquals;

import java.awt.Window;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.sym.Name;

import GenericLibrary.baseClass;

public class TC_6 extends baseClass {

	@Test
	public void LeadWithMandatoryPage() throws IOException, InterruptedException {
		
		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();
		home.getLeadButton().click();
		lead.getPlusbutton().click();
		
		//passing mandatory data to leadpage
		
		lead.getLastNameInleadPage().sendKeys(ppt.readingDataFromPropertiesFile("lastname"));
		lead.getLeadPagecompanyname().sendKeys(ppt.readingDataFromPropertiesFile("company"));
		lead.getLeadpageSavebtn().click();
		
		//validate duplicate
		
		lead.getDuplicatebtn().click();
		assertEquals(false, null);
		 
		//Logout
		
		utility.mouseHoveringOnElement(home.getAdministratorButton());
		Thread.sleep(3000);
		home.getSignout().click();
	}	




}

