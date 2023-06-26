package createOrganizationClass;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class Contactstest extends baseClass {
	@Test
	public void creatingcontatcWithexsistingOrg() throws InterruptedException {
		createcontact.getContactsLink().click();

		createcontact.getCreateContacticon().click();

		createcontact.getLastnameTf().sendKeys("aktar");

		String parentId = driver.getWindowHandle();

		createcontact.getAddOrganizationIcon().click();

		utility.switchingtargetPage(driver.getWindowHandles(), parentId);

		createcontact.getOptionsFromOrg().click();

		utility.switchingBackToMain(parentId);

		Thread.sleep(2000);

		createcontact.getSavebutton().click();
	}
}
