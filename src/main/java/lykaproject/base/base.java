package lykaproject.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base {
	
	
	static WebDriver driver ;
	public  static void setup()
	{
	WebDriverManager.chromedriver().setup();	
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://lyka.com.au/plan/create");	
	//driver.get("https://lyka.com.au/");
	driver.manage().window().maximize();
	}
	
}
