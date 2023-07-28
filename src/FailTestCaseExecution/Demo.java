package FailTestCaseExecution;

import org.testng.annotations.Test;

import graphql.Assert;

public class Demo {
	@Test
	
	public void T1() {
		
		System.out.println("T1");
		
		Assert.assertTrue(true);
	}
	
	@Test
public void T2() {
	
	System.out.println("T2");
	
	Assert.assertTrue(false);
}
	
	@Test
public void T3() {
	
	System.out.println("T3");
	
	Assert.assertTrue(true);
}
}
