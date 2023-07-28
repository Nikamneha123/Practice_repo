package CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser1 {

	WebDriver driver;

	@Parameters("Browsername")

	@Test

	public void OrangeHRM(String Browsername) {

		if (Browsername.equalsIgnoreCase("Chrome")) {

			// System.setProperty("webdriver.chrome.driver",
			// "C:\\Users\\admin\\eclipse-workspace\\TestNG_Practice\\Resource\\chromedriver.exe");

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (Browsername.equalsIgnoreCase("FireFox")) {

			// System.setProperty("webdriver.gecko.driver",
			// "C:\\Users\\admin\\eclipse-workspace\\TestNG_Practice\\Resource\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement username = driver.findElement(By.name("username"));
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.name("password"));
		password.sendKeys("admin123");

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		/*
		 * String exp_name = "Paul Collings"; WebElement act_name =
		 * driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
		 * 
		 * Assert.assertEquals(exp_name, act_name);
		 * 
		 * System.out.println("correct username");
		 * System.out.println("Execution completed");
		 */

		boolean Test = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed();
		Assert.assertTrue(Test);

		driver.quit();

	}

}
