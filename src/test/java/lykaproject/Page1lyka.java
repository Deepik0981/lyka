package lykaproject;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page1lyka {
	
	           WebDriver driver;
				
				@BeforeMethod
				public void setup()
				{
				WebDriverManager.chromedriver().setup();	
				driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				driver.get("https://lyka.com.au/plan/create");	
				driver.manage().window().maximize();
                }	
				
				
				@Test(priority=1)
				public void logo()
				
				{
					 //WebElement displaystatus = driver.findElement(By.xpath("//div[@class=''col-4']"));
					// AssertJUnit.assertEquals(displaystatus,true);
				 driver.findElement(By.cssSelector("img[src='../assets/logo/lyka_logo_green.png']"));
					//AssertJUnit.assertEquals(displaystatus,true);
				}
				
				
				@Test(priority=2)
				public void postcode()
				
					{
					driver.findElement(By.id("postcode-input")).sendKeys("3000");	
					}
				
				
				@Test(priority=3)
				public void dogname()
				
					{
					driver.findElement(By.id("dog-name-11")).sendKeys("Lucy");	
					driver.findElement(By.xpath("//span[text()='Next']")).click();	
					
					}
				
				
                @Test(priority=4)	
				public void dogbreed( ) {
				
				driver.findElement(By.id("breed-dropdown")).click();
				List<WebElement> breedtypes=driver.findElements(By.xpath("//*[@id='onboarding-content-rhs']/div/div[2]/div/div/div/div[1]/div/div/div/div/div/div/ul/li"));
					
					//List<WebElement> breedtypes=driver.findElements(By.xpath("div[@class='dropdown-ul-li-with-scroll-v2 border-top-0']ul/li"));
				for(WebElement btypes : breedtypes)
					     {
						
						if(btypes.getText().equals("Pure Breed"))
						
						{
						btypes.click();
						break;
						}
						
					    }
				}
					
						//driver.findElement(By.xpath("//div[@class='form-group custom-dropdown-v2 option-selected']")).click();
		
      
                
                
                @Test
                
				public void  typeandselectprimarybreed()
				{
                driver.findElement(By.id("primary-breed-11l")).sendKeys("na");	
				}
				
                
                
                
				@AfterMethod
				
				public void tearDown()
				{
				driver.quit();	
				}
				
				
	
}
	

				
			
				
			
				
				
		









		













		

	
	
	
	
	
	
	
	
	
	
	
	

