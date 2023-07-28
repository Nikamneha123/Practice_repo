package TestNG_feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class priority {

	//execution happens according to priority
	
	WebDriver driver;
	
          @BeforeMethod
	
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		
	}

            @Test(priority=1)
            public void C() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("Z");
            	
            }
            
            @Test(priority=2)
            public void B() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("X");
            	
            }
            @Test(priority=0)
            public void A() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("A");
            	
            }
            @Test(priority=-1)
            public void F() {
            	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
            	System.out.println(Logo1);
            	System.out.println("P");
            	
            }
            
            @AfterMethod
            public void Teardown() throws InterruptedException {
            	
            	Thread.sleep(3000);
            	
            	driver.quit();
            	
            	
            	
            }
            
            
            

	
	
	
	
}
