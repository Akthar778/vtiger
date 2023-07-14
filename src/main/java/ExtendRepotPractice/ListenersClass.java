package ExtendRepotPractice;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

	@Listeners(ExtendRepotPractice.ImplementListeners.class)
	public class ListenersClass  {
		@Test
		public void demoForListener() {
			System.out.println("this is test case 1");
		}
		@Test
		public void demoForListener2() {
			System.out.println("this is test case 2");
			assertEquals(false, true);
		}

}
