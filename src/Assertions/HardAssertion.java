package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
	
	@Test
	
	public void Demo() {
		
		System.out.println("Hello good morning");
		
		Assert.assertTrue(true);
		
		System.out.println("hello");
		
		Assert.assertEquals("Automation", "Automation");
		
		System.out.println("Execution completed");
	}
@Test
public void Demo1() {
	
	System.out.println("Hello good evening");
	
	Assert.assertTrue(true);
	
	System.out.println("hello1");
	
	Assert.assertEquals("Automation", "Manual");
	
	System.out.println("Execution completed");
}
@Test
public void Demo2() {
	
	System.out.println("Hello good night");
	
	Assert.assertTrue(true);
	
	System.out.println("hello2");
	
	Assert.assertEquals("Java", "Java");
	
	System.out.println("Execution completed");
}
}
