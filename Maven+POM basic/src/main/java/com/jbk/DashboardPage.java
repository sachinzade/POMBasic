package com.jbk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage {

	WebDriver dpdriver;//// object variable / instance variable

	public DashboardPage(WebDriver driver) {// constructor is used to initialize instance variables.
		this.dpdriver = driver;
	}

	public WebElement getHeader() {
		return dpdriver.findElement(By.xpath("/html/body/div/div[1]/section[1]/h1"));
	}

	public boolean verifyHeader() {
		return getHeader().isDisplayed();
	}

}
