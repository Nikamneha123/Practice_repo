package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
	
	@Test
	
	public void DemoTest() {
		
		SoftAssert soft=new SoftAssert();
		
		System.out.println("Execution Started");
		
		soft.assertEquals("Hello", "Hello");
		
		soft.assertEquals(true, true);
		
		System.out.println("Execution completed");
		
		System.out.println("Welcome");
		
		soft.assertAll();
		
	}
	
	@Test
	
	public void demo() {
SoftAssert soft=new SoftAssert();
		
		System.out.println("Execution Started demo method");
		
		soft.assertEquals("Hello", "Hello1");
		
		soft.assertEquals(true, true);
		
		System.out.println("Execution completed");
		
	//	System.out.println("Welcome");
		
		soft.assertAll();
		
		
	}

}
