package com.lyka.qa.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lyka.qa.base.testBase;

public class breedpage extends testBase{
	
	
		
		//Page factory-OR   @FindBy-annotation
			
			@FindBy(xpath="/span[@class='title' and contains(., 'Pure breed')]")
			WebElement button1;  
			
			@FindBy(xpath="//input[@type='text']")
			WebElement placeholder;
			
			@FindBy(xpath="//button[@title='Next']")
			WebElement nextbutton;
			
			
			//driver.findElements(By.xpath("/div[@class='data-options w-100')]")
			
			@FindBy(xpath="//span[@class='title' and contains(., 'Mix breed')]")
		    WebElement  button2;
			
			@FindBy(xpath="//span[@class='title' and contains(., 'Unknown')]")
		    WebElement  button3;
			
			//@FindBy(xpath="//buttton[@title='Next']")

	        public  void breedpagepage(){   //constructor-Initializing the page objects
	    PageFactory.initElements(driver, this);
	        }
	   
	        
	        public agepage validatebreedpage() {
	  	     button1.click();
	  	    // placeholder.sendKeys("Affenpinscher");
	  	   //  nextbutton.click();
	  	     
	  	     
	  	     
	  	  // List<WebElement> list = driver.findElementsByXPath("//li[@class='list-group cursor-pointer text-start");

	  	     
	         return new agepage();
	        }
	         
	        
	        
	         
	       /*  public breedpage validateMixedbreed() {
	      	     button2.click();
	             return new breedpage();
	         }
	         
	        
	         public breedpage validateUnknownbreed() {
	      	     button3.click();
	             return new breedpage(); 
	         */
	     	
	     }
	  	
	  	


