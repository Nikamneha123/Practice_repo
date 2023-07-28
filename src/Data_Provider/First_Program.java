package Data_Provider;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class First_Program {
	
	WebDriver driver;
	@Test(dataProvider="Logindata")
	
	public void LoginTest(String Uname,String PWD) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\eclipse-workspace\\Selenium_automation1\\Resource\\chromedriver.exe");
		 driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
			Thread.sleep(2000);
			
			WebElement USD= driver.findElement(By.name("username"));
			USD.sendKeys(Uname);
			Thread.sleep(2000);
			
			WebElement Pass=driver.findElement(By.name("password"));
			
			Pass.sendKeys(PWD);
			Thread.sleep(2000);
			
		//	String Exp_Name="Test Bambang";
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			boolean Test=driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed();
			Assert.assertTrue(Test);
			
			driver.quit();
			
	}

			
			@DataProvider(name="Logindata")
			
			public Object[][] LoginData(){
				Object data[][]=new Object[5][2];
				
				//correctUN & password
				
				data[0][0]="Admin";
				data[0][1]="admin123";
				
				//correctUN &Ip
				
				data[1][0]="Admin";
				data[1][1]="admin1234";
				
				//IUN &CPWD
				data[2][0]="Admin1";
				data[2][1]="admin123";
				
				//IUN&INPWD
				data[3][0]="Admin1";
				data[3][1]="admin1234";
				
				//EMPTYUN &CPWD
				
				data[4][0]="Admin";
				data[4][1]="admin1234";
				
				return 	data;
				
				
			}
						

}

