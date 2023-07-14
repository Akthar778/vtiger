package PracticeTestCase;

import org.testng.annotations.Test;

import GenericLibrary.baseClass;

public class Demo extends baseClass {
	
	@Test
	public void contactsPage () throws InterruptedException {
		home.getContactbtn().click();
		
		
		
	}
	
	public static void main(String[] args) {
		System.out.println("akthar");
	}
	
}
