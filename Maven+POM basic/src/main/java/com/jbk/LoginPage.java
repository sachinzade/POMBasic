package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver lpdriver; // it return null so it act as object / instance veriable 

	public LoginPage(WebDriver driver) {// constructor by we initialize object / instance variable  
		this.lpdriver = driver;
	}

	public WebElement getUname() {// same as getter and setter 
		return lpdriver.findElement(By.id("email"));
	}

	public WebElement getPassword() {// same as getter and setter 
		return lpdriver.findElement(By.id("password"));
	}

	public WebElement getButton() {// same as getter and setter 
		return lpdriver.findElement(By.xpath("//button"));
	}

	public void loginToAppl(String uname, String pass) { // passing the values in uname and password by using method
		getUname().sendKeys(uname);
		getPassword().sendKeys(pass);
		getButton().click();
	}

}
