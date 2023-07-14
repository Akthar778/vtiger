package createOrganizationClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericLibrary.ItestListenderImplementaioncls;

@Listeners(GenericLibrary.ItestListenderImplementaioncls.class)
public class Rep {
//	@Test
//public void demo() {
//	System.out.println("done");
//	ItestListenderImplementaioncls.Logger.pass("done");
//}
	
	
	@Test
	public void demoForListener2() {
		System.out.println("this is test case 2");
		assertEquals(false, true);
	}
}
