package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import com.testleaf.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}
	

	public MyHomePage clickCRMSFA() {
		
		return new MyHomePage(driver);
	}
	
	public LoginPage clickLogout() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	
	public HomePage verifyLoginSuccess() {
		return this;
	}
}
