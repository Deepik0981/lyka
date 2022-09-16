package com.lyka.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.lyka.qa.base.testBase;

public class namepage extends testBase{

	//Page factory-OR   @FindBy-annotation
	
	@FindBy(xpath="//input[@class='form-control text-input text-input-1']")
	WebElement Puppername;  
	
	@FindBy(xpath="//button[@text='Next']")
    WebElement  button;
	
	@FindBy(xpath="//img[contains(@src,'/_nuxt/img/lyka_logo_yellow.1857e78.svg')]")
	WebElement lykalogo;
	
	/*
	
	//Initializing page objects
	public namepage() {

	PageFactory.initElements(driver,this);
	}
	
	//Actions
	public String ValidatePageTitle() {
	return driver.getTitle();
	}
	
	public boolean validatelogo() {
		return lykalogo.isDisplayed();
	}	
		
	public postcodepage validatenamepage() {
		Puppername.sendKeys("Lucy");
		button.click();
		return new  postcodepage();
	}
	
	*/
	
	public namepage(){   //constructor-Initializing the page objects
	     PageFactory.initElements(driver, this);
	     }

	//methods /actions/feature
	
	
	
	public boolean validatelogo() {
		return lykalogo.isDisplayed();
	}	

   public postcodepage validatepuppername() {
	   Puppername.sendKeys("Lucy");
	   button.click();
        return new postcodepage();
    	
    }

	

}	
	
