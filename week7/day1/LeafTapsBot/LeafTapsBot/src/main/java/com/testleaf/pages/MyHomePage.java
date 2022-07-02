package com.testleaf.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public LeadsPage clickLeadsLink() {
		
		return new LeadsPage(driver);
	}
}
