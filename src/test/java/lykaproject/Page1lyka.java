package lykaproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page1lyka {
	
	WebDriver driver;
				
				@BeforeClass
				public void setup()
				{
				WebDriverManager.chromedriver().setup();	
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				}
				
				
				@BeforeMethod               // Assertion:Asser.Metthod(Actual,expected)
				public void getCurrentUr() {
					
					driver.get("https://lyka.com.au/plan/create");
			   // driver.getCurrentUrl();
					
				//String URL = driver.getCurrentUrl();
			//	Assert.assertEquals(URL, "https://lyka.com.au/plan/create" );
				//Assert.assertEquals(driver.getCurrentUrl(), "https://lyka.com.au/plan/create");
				
                
				//String expected_url = "https://lyka.com.au/plan/creat";
		       // String current_url = driver.getCurrentUrl();
		 
		        //Assert.assertTrue(expected_url.equals(current_url), "URL does not match\n");
		        
		      //  System.out.println("AssertTrue Test Passed\n");
				
				}	
				
				
				@Test(priority=1)
				public void logo()
				
				{
					WebElement Lykalogo = driver.findElement(By.cssSelector("img[src='../assets/logo/lyka_logo_green.png']"));
				     Assert.assertEquals(true, Lykalogo.isDisplayed());
				}
				
				@Test 
				public void  postcode() {
				driver.findElement(By.id("postcode-input")).sendKeys("3000");
				 
				}  // Assert.assertEquals(true, Postcode.isDisplayed());
				    		
				
				@Test 
				 
				 public void dogname() {
				 
					 driver.findElement(By.xpath("//input[@class='form-control input-field-onboarding input-field-onboarding-question text-left no-border-right']")).sendKeys("Lucy");
					
					//driver.findElement(By.xpath("//input[@id='dog-name-11']")).sendKeys("Lucy");
					// driver.findElement(By.xpath("//input[@placeholder=='Beethoven']")).sendKeys("Lucy");
				
				}
				 
							
				 @Test
				 
				 public void typbreed() {
				 
				 
			    driver.findElement(By.id("breed-dropdown")).click();
							
		         }
				
                 @AfterMethod
				
				 public void tearDown()
				{
				//driver.quit();	
			
				}
				
       
				}

				
			
				
			
				
				
		









		













		

	
	
	
	
	
	
	
	
	
	
	
	

