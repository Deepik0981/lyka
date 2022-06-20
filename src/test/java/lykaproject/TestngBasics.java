package lykaproject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngBasics {
	
	@BeforeClass//2
	public void LaunchBrowser() {
		
		System.out.println("launch browser");
		
		}
	
	
	@BeforeMethod//3
	public void enterurl() {
	
	System.out.println("Enter url");

	}
	@BeforeTest//1
	public void login() {
		
		
		System.out.println("enter username and password");	
	}
	
	@Test//4
	public void Titletest() {
		System.out.println("title");	
	}
	
	@AfterMethod//5
	
	public void closeurl() {
	
		System.out.println("closeurl");
	}
	
	@AfterTest//6
	
	public void logout() {
	
		System.out.println("logout");
	
}
}

