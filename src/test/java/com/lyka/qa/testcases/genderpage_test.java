package com.lyka.qa.testcases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.lyka.qa.base.testBase;
import com.lyka.qa.pages.agepage;
import com.lyka.qa.pages.breedpage;
import com.lyka.qa.pages.genderpage;
import com.lyka.qa.pages.namepage;
import com.lyka.qa.pages.postcodepage;

public class genderpage_test  extends testBase{

	
	namepage Namepage;
	postcodepage Postcodepage;
	genderpage Genderpage;
	breedpage  Breedpage;
	agepage Agepage;
	public genderpage_test() {
		super();//super class constructor
	}
	
	
	
    @BeforeTest
	
	public void setup() {
	initialization();
	//driver.get("https://buildabox.beta.lyka.com.au/get-started");
	// Namepage = new namepage();  //name page object
	Namepage =  new namepage();
	Postcodepage=Namepage.validatepuppername();
	Genderpage=Postcodepage.validatepostcode();
	Breedpage=Genderpage.validategenderpage();
	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
	}
	
	@Test(priority=1)
	public void validategenderpagetest() {
	//driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);	{
    Genderpage.validategenderpage();
    driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);	
	}

	
	/*@Test(priority=1)
	public void validategenderpagetest() {
    Genderpage.validategenderBoy()
    driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);	
	}
	*/
	@AfterTest
	
	public void tearDown() {
		driver.quit();
	
	
	
	
	}
	
}


