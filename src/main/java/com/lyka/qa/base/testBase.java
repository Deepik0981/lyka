package com.lyka.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.lyka.qa.utililty.testutil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testBase {
	
	
	 public static  WebDriver  driver;
	public static  Properties prop;// prop is global variable
	
	public testBase(){      
		
		try{
			prop = new Properties();
			//FileInputStream ip =new FileInputStream(
					
			//System.getProperty("/Users/aparnajk/eclipse-workspace/lykaproject/src/main/java/com/lyka/qa/config/config.properties"));
			FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/lyka/qa/config/config.properties");
			prop.load(file);
			
	         }
		catch(FileNotFoundException e) {
			
			e.printStackTrace();
		    } catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public WebDriver getDriver() {
	    return driver;
	  }
    
	
	public static void initialization()
	{
		
		
		
		
	//String browserName =prop.getProperty("browser");
	
	
	
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	
	/*if(browserName.equals("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	else if (browserName.equals("FF"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	*/
	
	
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://buildabox.beta.lyka.com.au/get-started");
	
	}
}