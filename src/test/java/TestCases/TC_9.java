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

public class TC_9 extends baseClass {
   //fail
	@Test
	public void LeadWithMandatoryPage() throws IOException, InterruptedException {
		
		//login
		
		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();
		home.getLeadButton().click();

		
		//drop down 
		
		home.getQucikCreateDropdown().click();
		Thread.sleep(3000);
		utility.handlingDropdown(home.getEventSelectDropDown(), 5);
		System.out.println("aaaaaa");
		Thread.sleep(3000);

		//Logout
		
		utility.mouseHoveringOnElement(lead.getLeadAdminstractionButtonHover());
		lead.getLeadpagelogout2().click();
		Thread.sleep(3000);
		
	}	




}

