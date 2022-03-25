package com.jbk.test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.jbk.DashboardPage;
import com.jbk.LoginPage;

public class LoginTest 
{

	WebDriver driver = null;

	@Test
	public void loginTest() 
	{
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();// intializing the refrence veriable
		driver.get("file:///D:/SELENIUM%20+%20TESTING/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		LoginPage lp = new LoginPage(driver); // by making the object we can use its methods & passign the  object driver by constructor
		lp.loginToAppl("kiran@gmail.com", "123456");// passing the values in  methods
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		driver.close();
	}

	@Test
	public void dashboardTest() 
	{
		System.getProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/SELENIUM%20+%20TESTING/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		LoginPage lp1 = new LoginPage(driver);
		lp1.loginToAppl("kiran@gmail.com", "123456");

		DashboardPage dp = new DashboardPage(driver);
		boolean value = dp.verifyHeader();
		Assert.assertTrue(value);
		driver.close();
	}
}
