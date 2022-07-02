package com.testleaf.pages;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	
	public LeadsPage(RemoteWebDriver driver) {
		this.driver = driver;
	}

	public CreateLeadPage clickCreateLead() {
		
		return new CreateLeadPage(driver);
	}
}
