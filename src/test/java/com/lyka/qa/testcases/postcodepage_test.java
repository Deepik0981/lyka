package com.lyka.qa.testcases;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lyka.qa.base.testBase;

import com.lyka.qa.pages.namepage;
import com.lyka.qa.pages.postcodepage;

public class postcodepage_test extends testBase{
	namepage Namepage;
	//breedpage Breedpage;
	postcodepage Postcodepage;
	
	public postcodepage_test() {
		super();//super class constructor
	}
	
	
	
    @BeforeTest
	
	public void setup() {
	initialization();
	//driver.get("https://buildabox.beta.lyka.com.au/get-started");
	// Namepage = new namepage();  //name page object
	Namepage =  new namepage();
	Postcodepage=Namepage.validatepuppername();
	  
	}
	
	@Test(priority=1)
	public void validatepostcodepagetest() {
    Postcodepage.validatepostcode();
    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);	
	}
	
	
	
	@AfterTest
	
	public void tearDown() {
		driver.quit();
	
	
	
	
	}
	
}
