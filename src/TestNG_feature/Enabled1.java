package TestNG_feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Enabled1 {

	//execution happens according to priority
	
	WebDriver driver;
	
          @BeforeClass
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		
	}

           /* @Test
            public void C() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("Z");
            	
            }*/
            
            @Test(enabled=false)
            public void B() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("X");
            	
            }
            @Test(enabled=false)
            public void A() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("A");
            	
            }
            @Test(enabled=true)
            public void S() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("S");
            	
            }
            @Test
            public void F() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("P");
            	
            }
            
            @AfterClass
            public void Teardown() throws InterruptedException {
            	
            	Thread.sleep(3000);
            	
            	driver.quit();
            	
            	
            	
            }
            
            
            

	
	
	
	
}
