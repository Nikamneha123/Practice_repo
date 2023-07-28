package TestNG_feature;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class enabledXMLfile {
	WebDriver driver;
	
    @SuppressWarnings("deprecation")
	@BeforeClass

public void setup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	
}
    
    @Test
    public void B() {
    	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
    	System.out.println(Logo1);
    	System.out.println("X");
    	
    }
    @Test
    public void A() {
    	boolean Logo1=driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
    	System.out.println(Logo1);
    	System.out.println("A");
    	
    }
    @Test
    
    public void Test1() {
    	
    	System.out.println("Test1");
    	
    }
    
   @Test
    
    public void Test2() {
    	
    	System.out.println("Test2");
    	
    }
   
   @Test
   public void Test3() {
	   System.out.println("C");
	   
   }
   
   @AfterClass
   
   public void Teardown() throws InterruptedException {
	   Thread.sleep(2000);
	   
	   driver.quit();
	   
	   
	   
	   
	   
   }
   
    
    
}
