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

public class TC_8 extends baseClass {
    //pass
	@Test
	public void LeadWithMandatoryPage() throws IOException, InterruptedException {
		
		//login
		
		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();
		home.getLeadButton().click();
		
		
		//delete existing leads
		
		Thread.sleep(3000);
		
		lead.getLeadCheckBox().click();
		Thread.sleep(5000);
		lead.getLeadDeleteButoon().click();
		
		
		
		
		 
		//Logout
		
		utility.mouseHoveringOnElement(lead.getLeadAdminstractionButtonHover());
		lead.getLeadpagelogout2().click();
		Thread.sleep(3000);
		
	}	




}

