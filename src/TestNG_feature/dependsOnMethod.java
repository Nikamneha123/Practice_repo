package TestNG_feature;

import org.testng.annotations.Test;

public class dependsOnMethod {
	
	@Test
	
	public void LoginTest() {
		
		System.out.println("LoginTest");
		
		
		//int number=100/0;
	}
	@Test(dependsOnMethods="LoginTest")
public void Homepage() {
		System.out.println("Homepage");
		
	}

	@Test(dependsOnMethods="LoginTest")
public void Searchpage() {
	
	System.out.println("Searchpage");
}

	@Test
public void Refreshpage() {
	System.out.println("Refreshpage");
	
}



}
