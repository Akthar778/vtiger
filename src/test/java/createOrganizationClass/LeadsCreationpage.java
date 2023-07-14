package createOrganizationClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class LeadsCreationpage extends baseClass{
	@Test
	public void testcaseToCreateAndDeletelead() throws InterruptedException{
		String Firstname="archana";
		createleadsPage.getLeadsLink().click();

		createleadsPage.getCreateLeadsButton().click();

		createleadsPage.getFirstnameTF().sendKeys(Firstname);

		createleadsPage.getLastnameTF().sendKeys(" here ");

		createleadsPage.getCompanynameTF().sendKeys("qsp");

		createleadsPage.getSaveButton().click();

		createleadsPage.getDuplicatebutton().click();

		createleadsPage.getSaveButton().click();

		createleadsPage.getDeleteButton().click();

		driver.switchTo().alert().accept();
		Thread.sleep(7000);

		driver.navigate().refresh();

		/*
		 * WebElement leadscheckbox =
		 * driver.findElement(By.xpath("//a[contains(text(),'"+Firstname+
		 * "')]/../..//input[@name='selected_id']")); driver.findElement(By.
		 * xpath("//a[contains(text(),'	Raja')]/../..//input[@name='selected_id']"));
		 * leadscheckbox.click();
		 */

		List<WebElement> allElements = driver.findElements(By.xpath("//a[contains(text(),'"+Firstname+"')]/../..//input[@name='selected_id']"));
		utility.scrollingAction(400, 400);
		Thread.sleep(2000);
		for(WebElement element:allElements) {
			try {
			element.click();
			}catch(Exception e) {
				break;
			}
		}

		createleadsPage.getDeleteleadsButton().click();

		driver.switchTo().alert().accept();


	}
}
