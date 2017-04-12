package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.MercuryHomePage;

public class DriverClass {
	
	WebDriver driver;
	
	@BeforeSuite
	public void openBrowser(){
		driver= new FirefoxDriver();
	}
	
	@AfterSuite
	public void closeBrowser(){
		driver.quit();
	}

	@Test
	public void MercuryTest(){
		
		MercuryHomePage MHP=PageFactory.initElements(driver, MercuryHomePage.class);
		
		MHP.openUrl("http://newtours.demoaut.com/mercurywelcome.php");
		MHP.MercuryHomePageLoginImp();
		
		
	}
	
	
}
