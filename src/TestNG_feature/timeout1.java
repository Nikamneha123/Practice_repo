package TestNG_feature;

import org.testng.annotations.Test;

public class timeout1 {
	
	
	@Test(timeOut=5000)
	
	public void LoginTest() throws InterruptedException {
		for(;;) {
		//	Thread.sleep(2000);
			System.out.println("hello");
		}
		
		
		
	}
	
	

}
