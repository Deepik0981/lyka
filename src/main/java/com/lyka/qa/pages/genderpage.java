package com.lyka.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lyka.qa.base.testBase;

public class genderpage extends testBase{
	
	//Page factory-OR   @FindBy-annotation
		
	    @FindBy(xpath="//span[@class='title' and text()='Boy']")
		//@FindBy(xpath="//span[@class='title']']/span[text()='Boy']")
		//@FindBy(xpath="//span[@class='title']")
		WebElement button1;  
		
		//@FindBy(xpath="//span[@class='title'and @text='Boy']")
	   // WebElement  button		
		@FindBy(xpath="//button[@text='Next']")
	    WebElement  button3;

        public genderpage(){   //constructor-Initializing the page objects
    PageFactory.initElements(driver, this);
        }
   
        
        public breedpage validategenderpage() {
  	     button1.click();
  	     button3.click();
         return new breedpage();
        }
         
         
        /* public breedpage validategenderGirl() {
      	     button2.click();
             return new breedpage();
         }
         
        
        // public breedpage validateNextbutton() {
      	 //    button3.click();
          //   return new breedpage(); 
         */
     	
     }
  	
  	
  	

  