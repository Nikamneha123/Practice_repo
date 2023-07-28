package Parallel_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//import Assertions.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo_parallel {
	WebDriver driver;
	@Test
	public void Setup() {
	
	WebDriverManager.chromedriver().setup();
	
	//System.setProperty("WebDriver.Chrome.driver", "")
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	

}
	@Test
	public void Setup1() {
		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("WebDriver.Chrome.driver", "")
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/login/");
		
		

	}
	
}