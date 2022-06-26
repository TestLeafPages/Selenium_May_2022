package hooks;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass extends AbstractTestNGCucumberTests{

	public static ChromeDriver driver;
	
	@BeforeMethod
	public void preCondition() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
