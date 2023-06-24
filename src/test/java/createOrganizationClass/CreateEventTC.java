package createOrganizationClass;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class CreateEventTC  extends baseClass{
	@Test
public void ceateEvenetTestcase() throws InterruptedException {
		homepage.getQuickCreateDropdown().click();
		
		utility.handlingDropdown(homepage.getQuickCreateDropdown(), "Events");
		
		homepage.getSubjectTextfield().sendKeys("demo");
		
		//homepage.getDatestartTF().sendKeys("2023-07-25");
		utility.enteringDataIntoElement("2023-07-25", homepage.getDatestartTF());
		
		Thread.sleep(2000);
		
		//homepage.getEndDateTF().sendKeys("2023-07-27");
		
		utility.enteringDataIntoElement("2023-07-27", homepage.getEndDateTF());

		Thread.sleep(2000);

		homepage.getSavebutton().click();
}
}
