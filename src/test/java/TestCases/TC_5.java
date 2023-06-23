package TestCases;

import java.awt.Window;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.sym.Name;

import GenericLibrary.baseClass;

public class TC_5 extends baseClass {

	@Test
	public void CreateExistingOrganisation() throws IOException, InterruptedException {

		login.getUserNameTF().sendKeys(ppt.readingDataFromPropertiesFile("username"));
		login.getPasswordTF().sendKeys(ppt.readingDataFromPropertiesFile("password"));
		login.getLoginclickButton().click();
		home.getContactbtn().click();
		OrgPage.getPlusbtn().click();
		leadpage.getLastName().sendKeys(ppt.readingDataFromPropertiesFile("lastname"));
		OrgPage.getOrganisationbtn().sendKeys(ppt.readingDataFromPropertiesFile("OrganisationName"));
		createcontPage.getOrgPlusBtn().click();
		Thread.sleep(3000);
  //WebElement testingToVerifiy = driver.findElement(By.xpath("//a[@id='1']"));


String winHandleBefore = driver.getWindowHandle();
for(String winHandle : driver.getWindowHandles()){
    driver.switchTo().window(winHandle);
}

//driver.findElement(By.name("search_text")).sendKeys("akthar");
	//createcontPage.getSelectExistCompany().click();


		System.out.println("switch frame sucess");
		
		Thread.sleep(3000);
		createcontPage.getSelectExistCompany().click();
		driver.switchTo().defaultContent();
		System.out.println("switch back successfully");



	}
}
