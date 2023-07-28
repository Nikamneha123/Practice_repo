package TestNG_feature;

import org.testng.annotations.Test;

public class expectedExcption {

	@Test(expectedExceptions=Exception.class)
	
	public void LoginTest() {
		
		System.out.println("Hello");
		int num=100/0;
		
	}
	
	
	
	
	
}
