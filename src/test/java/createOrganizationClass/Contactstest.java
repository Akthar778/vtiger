package createOrganizationClass;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class Contactstest extends baseClass {
	@Test
public void creatingcontatcWithexsistingOrg() {
	createcontact.getContactsLink().click();
	
	createcontact.getCreateContacticon().click();
	
	createcontact.getLastnameTf().sendKeys("aktar");
	
	createcontact.getAddOrganizationIcon().click();
	
	utility.switchingtargetPage(driver.getWindowHandles(), createcontact.getOptionsFromOrg());
	
	createcontact.getSavebutton().click();
}
}
