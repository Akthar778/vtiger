package createOrganizationClass;

import org.testng.annotations.Test;

import GenericLibrary.ExcelUtility;
import GenericLibrary.baseClass;

public class CreateOrganizationClass extends baseClass{
	@Test(dataProvider = "testdata", dataProviderClass = ExcelUtility.class)
	public void organizationcreating(String data) throws InterruptedException {
		homepage.getOrganizationsLink().click();

		orgpage.getCreateOrganizationIcon().click();

		createorgclass.getOrganizationNameTF().sendKeys(data);

		utility.selectReference(createorgclass.getIndustryDropdown()).selectByValue("Banking");

		utility.selectReference(createorgclass.getAccountTypeDropdown()).selectByValue("Customer");

		Thread.sleep(1000);

		createorgclass.getGroupRadioButton().click();

		Thread.sleep(3000);

		utility.handlingDropdown(createorgclass.getAssignedtoDropdon(), 1);
		
		createorgclass.getSavebutton().click();	
		
		Thread.sleep(1000);
		
		if(createorgclass.getFinalConfirmationtext().getText().contains(data)) {
			System.out.println("testcase passed");
		}else {
			System.out.println("testcase failed");
		}		
	}
}
