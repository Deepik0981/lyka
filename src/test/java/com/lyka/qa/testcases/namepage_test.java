package com.lyka.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lyka.qa.base.testBase;
import com.lyka.qa.pages.breedpage;
import com.lyka.qa.pages.genderpage;
import com.lyka.qa.pages.namepage;
import com.lyka.qa.pages.postcodepage;

public class namepage_test extends testBase{
	
	namepage Namepage;
	postcodepage Postcodepage;
	
	public namepage_test() {
		super();//super class constructor
	}
	
	
	
    @BeforeTest
	
	public void setup() {
	initialization();
	//driver.get("https://buildabox.beta.lyka.com.au/get-started");
	 Namepage = new namepage();  //name page object
	 Postcodepage = new postcodepage();
	 
	}
	
	@Test(priority=1)
	public void validatepuppernametest() {
    Namepage.validatepuppername();
    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);	
	}
	
	@Test(priority=2)
	
	public void validatelogo() {
	boolean flag = Namepage.validatelogo();
	Assert.assertTrue(flag);
	driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	
	}
		
	
	
	@AfterTest
	
	public void tearDown() {
		driver.quit();
	
	
	
	
	}
	
}
