package Parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;
	
	@Test
	public void Setup() {
		
		//WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		//Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
	}
	

@Test

public void teardown() {
	
	
}
}