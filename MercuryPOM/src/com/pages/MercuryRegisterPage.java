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
   
   @FindBy(name="phone")
   WebElement phoneNumber;
   
   @FindBy(id="userName")
   WebElement Email;
   
   
   public void MecuryRegiser(){
	   Fname.sendKeys("vasu");
	   Lname.sendKeys("Mu");
	  //phoneNumber.sendKeys("8473059516");
	   Email.sendKeys("abc@gmail.com");
	   
	   
   }

}
