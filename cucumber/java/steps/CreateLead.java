package steps;

import org.openqa.selenium.By;
import org.testng.Assert;

import hooks.BaseClass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLead extends BaseClass{

	@When("Click on {string} link")
	public void clickLink(String option) {
		driver.findElement(By.linkText(option)).click();
	}
	
	@Then("{string} page should be displayed")
	public void verifyMyHomePage(String pageName) {
//		if(driver.findElement(By.linkText(pageName)).isDisplayed())
//			System.out.println("page is displayed");
//		else
//			System.out.println("Page is not displayed");
		Assert.assertTrue(driver.findElement(By.linkText(pageName)).isDisplayed());
	}
}
