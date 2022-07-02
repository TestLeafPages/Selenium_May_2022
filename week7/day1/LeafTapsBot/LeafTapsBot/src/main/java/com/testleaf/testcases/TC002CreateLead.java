package com.testleaf.testcases;

import org.testng.annotations.Test;

import com.testleaf.base.ProjectSpecificMethods;
import com.testleaf.pages.LoginPage;

public class TC002CreateLead extends ProjectSpecificMethods{

	@Test
	public void runCreateLead() {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsLink()
		.clickCreateLead()
		.enterCompanyName();
	}
}
