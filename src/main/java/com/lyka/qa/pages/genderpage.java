package com.lyka.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lyka.qa.base.testBase;

public class genderpage extends testBase{
	
	//Page factory-OR   @FindBy-annotation
		
		@FindBy(xpath="//span[text()='Boy']")
		WebElement button1;  
		
		@FindBy(xpath="//span[text()='Girl']")
	    WebElement  button2;
		
		@FindBy(xpath="//button[@text='Next']")
	    WebElement  button3;

        public genderpage(){   //constructor-Initializing the page objects
    PageFactory.initElements(driver, this);
        }
   
        
        public breedpage validategenderBoy() {
  	     button1.click();
         return new breedpage();
        }
         
         
         public breedpage validategenderGirl() {
      	     button2.click();
             return new breedpage();
         }
         
        
         public breedpage validateNextbutton() {
      	     button3.click();
             return new breedpage(); 
         
     	
     }
  	
  	
  	

  }