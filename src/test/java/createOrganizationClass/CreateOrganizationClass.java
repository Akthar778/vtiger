package createOrganizationClass;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class CreateOrganizationClass extends baseClass{
	@Test
	public void organizationcreating() throws InterruptedException {
		homepage.getOrganizationsLink().click();

		orgpage.getCreateOrganizationIcon().click();

		createorgclass.getOrganizationNameTF().sendKeys("demo12");

		utility.selectReference(createorgclass.getIndustryDropdown()).selectByValue("Banking");

		utility.selectReference(createorgclass.getAccountTypeDropdown()).selectByValue("Customer");

		Thread.sleep(1000);

		createorgclass.getGroupRadioButton().click();

		Thread.sleep(1000);

		utility.handlingDropdown(createorgclass.getAssignedtoDropdon(), "Support Group");
		
		createorgclass.getSavebutton().click();	
		
		Thread.sleep(2000);
		
		if(createorgclass.getFinalConfirmationtext().getText().contains("demo12")) {
			System.out.println("testcase passed");
		}else {
			System.out.println("testcase failed");
		}		

	}
}
