package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// setup chromedriver
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
		
		// Open the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
	
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// maximize the browser window
		driver.manage().window().maximize();
		
		// Identify WebElement
		WebElement eleUserName = driver.findElement(By.id("username"));
		// Enter the Username
		eleUserName.sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
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
		
		// To close the browser
		driver.close();
	}

}
