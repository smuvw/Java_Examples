package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MercuryRegisterPage {
	
	WebDriver driver;

	
public MercuryRegisterPage(WebDriver driver){
		
		this.driver = driver;
		
	}

   @FindBy(name="firstName")
   WebElement Fname;
   
   @FindBy(name="lastName")
   WebElement Lname; 
   
   
   public void MecuryRegiser(){
	   Fname.sendKeys("vasu");
	   Lname.sendKeys("Mu");
	   
	   
   }

}
