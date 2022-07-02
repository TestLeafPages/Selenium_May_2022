package com.testleaf.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC001Login extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		fileName = "TC001Login";
	}

	@Test(dataProvider = "getData")
	public void runLogin(String username, String password) {
		System.out.println(driver);
		new LoginPage(driver).enterUserName(username)
		.enterPassword(password)
		.clickLogin()
		.clickLogout();
		
	}
}
