package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mergeLead extends BaseClass{

	@Test
	public void editLead() throws InterruptedException {
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haja");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		// select conference in source dropdown
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(eleSource);
		dd.selectByVisibleText("Conference");
		
		driver.findElement(By.name("submitButton")).click();
		
		Thread.sleep(2000);
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		System.out.println(firstName);
		
		if(firstName.equals("Haj")) {
			System.out.println("Success");
		} else {
			System.out.println("Fail");
		}
	}

}
