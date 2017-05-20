package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryHomePage {
	
	WebDriver driver;
	
	public MercuryHomePage(WebDriver driver){
		
		this.driver = driver;
		
	}
	
	//Create OR 
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
		WebElement Password;
	
	@FindBy(name="login")
	WebElement Login;
	
	@FindBy(xpath="//a[text()='REGISTER']")
	WebElement Register;
	
	//You need add the methods 
	
	public void MercuryHomePageLoginImp(){
	
		UserName.sendKeys("sri");
		Password.sendKeys("testing");
		Login.click();
	}
	
	public void openUrl( String URL){
		
		driver.get(URL);
	}
	
	public void MercuryRegisterLink(){
		Register.click();
	}
	
	public void waittime(){
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
