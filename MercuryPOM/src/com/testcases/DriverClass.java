package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.MercuryHomePage;
import com.pages.MercuryRegisterPage;


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

/*	@Test
	public void MercuryTest(){
		
		MercuryHomePage MHP=PageFactory.initElements(driver, MercuryHomePage.class);
		MercuryRegistorPage MRP=PageFactory.initElements(driver, MercuryRegistorPage.class);
		
		
		MHP.openUrl("http://newtours.demoaut.com/mercurywelcome.php");
		MHP.MercuryHomePageLoginImp();
		
		//MRP.MecuryRegiser();
		
		
	}*/
	
	
	@Test
	public void MercuryRegister(){
		
		MercuryHomePage MHP=PageFactory.initElements(driver, MercuryHomePage.class);
		MercuryRegisterPage MRP=PageFactory.initElements(driver, MercuryRegisterPage.class);
		
		
		MHP.openUrl("http://newtours.demoaut.com/mercurywelcome.php");
		MHP.MercuryRegisterLink();
		MHP.waittime();
		MRP.MecuryRegiser();
		//MHP.MercuryHomePageLoginImp();
		
		//MRP.MecuryRegiser();
		
		
	}
	
	
}
