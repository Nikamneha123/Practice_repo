package Assertions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assertion {
	
	WebDriver driver;
	
	@BeforeMethod
	
	public void Setup() {
		
		WebDriverManager.chromedriver().setup();
		
		//System.setProperty("WebDriver.Chrome.driver", "")
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test
	public void OrangeHRM() {
		WebElement Uname=driver.findElement(By.name("username"));
		
		WebElement pass=driver.findElement(By.name("password"));
		
		boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
		
		Assert.assertEquals(Logo1, false);
		
		System.out.println("Execution completed");
		
	}
	
	@AfterMethod
	
	public void Teardown() {
		
		driver.quit();
	}
	
	
	
	
	
	
	
	

}
