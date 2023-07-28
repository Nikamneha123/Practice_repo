package Annotations_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	//1.	@BeforeSuite
	@BeforeSuite
	
	public void Setup() {
		
		System.out.println("@BeforeSuite---------system.set");
	}

	//2.@BeforeTest
	
	@BeforeTest
	public void URL() {
		
		System.out.println("@BeforeTest--------URL");
	}
	
	//3.@BeforeClass
	
	@BeforeClass
	
	public void LaunchBrowser() {
		
		System.out.println("@BeforeClass-----------launch browser");
		
	}
	
	//4.@BeforeMethod
	@BeforeMethod
	
	public void Login() {
		System.out.println("@BeforeMethod--------loginpage");
		
	}
		@Test
		
		public void Title() {
			
			System.out.println("Google title");
		}

		
	
		@AfterMethod
		
		public void Logout() {
			System.out.println("@AfterMethod--------logoutpage");
			
		}
	
		@AfterClass
		
		public void closeBrowser() {
			
			System.out.println("@afterClass-----------close browser");
			
		}
		
		@AfterTest
		public void deleteCookies() {
			
			System.out.println("@AfterTest--------deleteCookie");
		}
		
	
		@Test
		
		public void set() {
			
			System.out.println("@test----A");
		}
		
		@AfterSuite
		public void LOGout() {
			
			System.out.println("@Aftersuit--------logout");
		}
		
	@Test
		
		public void set1() {
			
			System.out.println("@test----b");
		
}
}
