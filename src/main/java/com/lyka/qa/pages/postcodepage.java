package com.lyka.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lyka.qa.base.testBase;

public class postcodepage extends testBase{
	
//Page factory-OR   @FindBy-annotation
	
	@FindBy(xpath="//input[@type='number']")
	WebElement postcode;  
	
	@FindBy(xpath="//button[@text='Next']")
    WebElement  button;
	
	
	public postcodepage(){   //constructor-Initializing the page objects
	     PageFactory.initElements(driver, this);
	     }

	//methods /actions/feature
	
	
	
	

  public genderpage validatepostcode() {
	  postcode.sendKeys("2000");
	   button.click();
       return new genderpage();
   	
   }
	
	
	

}
