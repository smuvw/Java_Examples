package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.MercuryHomePage;
import com.pages.MercuryRegisterPage;


public class DriverClass {
	
	WebDriver driver;
	
/*	@BeforeSuite
	public void openBrowser(){
		driver= new ChromeDriver();
	}
	
	@AfterSuite
	public void closeBrowser(){
		driver.quit();
	}*/
	
	@BeforeMethod
	public void openBrowser(){
		driver= new ChromeDriver();
	}
	
	@AfterMethod
	public void closeBrowser(){
		driver.quit();
	}
	

@Test(priority=1)
	public void MercuryTest(){
	
		
		MercuryHomePage MHP=PageFactory.initElements(driver, MercuryHomePage.class);
		MercuryRegisterPage MRP=PageFactory.initElements(driver, MercuryRegisterPage.class);
		
		
		MHP.openUrl("http://newtours.demoaut.com/mercurywelcome.php");
		MHP.MercuryHomePageLoginImp();
		
		//MRP.MecuryRegiser();
		
		
	}
	
	
@Test(priority=2)
	public void MercuryRegister() throws InterruptedException{
		
		MercuryHomePage MHP=PageFactory.initElements(driver, MercuryHomePage.class);
		MercuryRegisterPage MRP=PageFactory.initElements(driver, MercuryRegisterPage.class);

		
		MHP.openUrl("http://newtours.demoaut.com/mercurywelcome.php");
		MHP.MercuryRegisterLink();
		//MHP.waittime();
		Thread.sleep(9000);
		MRP.MecuryRegiser();
		//MHP.MercuryHomePageLoginImp();
		
		//MRP.MecuryRegiser();
		
		
	}
	
	
}
