package lykaproject;

import java.util.concurrent.TimeUnit;
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

public class lyka_getstarted {

	
	
	public static WebDriver driver;
	
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
		
		driver.get("https://buildabox.beta.lyka.com.au/get-started");
}
	@Test
	public void namepage()
	
	{
		driver.findElement(By.xpath("//input[@class='form-control text-input text-input-1']")).sendKeys("Lucy");
		//driver.findElement(By.xpath("//input[@id='dog-name-11']")).sendKeys("Lucy");
		//driver.findElement(By.xpath("//button[@class='btn px-4 py-0 shadow-none theme-primary btn-lg rounded-pill']")).click();;
		//driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[3]/div/form/div[3]/button/div")).click();
		//*[@id="__layout"]/div/div/div[3]/div/form/div[3]/button/div
			
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@class='form-control text-input']")).sendKeys("2000");
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[3]/div/form/div[3]/button/div/span")).click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[3]/div/form/div[1]/div/div/div/div[1]/span")).click();
			
	}
		//driver.findElement(By.xpath("//input[@class='form-control text-input']")).sendKeys("2000");
		//driver.findElement(By.xpath("//button[@class='btn px-4 py-0 shadow-none theme-primary btn-lg rounded-pill']")).click();}
/*	@Test
	public void postcodepage()
	
	{
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		System.out.println("output");
		driver.findElement(By.xpath("//input[@class='form-control text-input']")).sendKeys("2000");
		
		
		//driver.findElement(By.xpath("//button[@class='btn px-4 py-0 shadow-none theme-primary btn-lg rounded-pill']")).click();
		//driver.findElement(By.xpath("//span[contains(text(),'Next')][1]")).click();
		driver.findElement(By.xpath("//*[@id=\"__layout\"]/div/div/div[3]/div/form/div[3]/button/div/span")).click();
		//driver.findElement(By.xpath("//input[@class='form-control text-input']")).sendKeys("2000");
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		
	}	

	/*@Test
	public void genderpagepage()
	
	{
		//driver.findElement(By.xpath("//span[contains(text(),'Boy')]")).click();
		driver.findElement(By.xpath("//div[@class='btn button-inactive text-secondary shadow-none w-100 text-center btn-lg'][contains(text(),'Boy')]")).click();

		

		
	}	
	
	
	*/
	@AfterMethod
	
	 public void tearDown()
	{
	//driver.quit();	

	}
	

	}


