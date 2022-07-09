package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTextToAppear2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/TextChange.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//step1: Create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		WebElement eleTextChange = driver.findElement(By.id("btn"));
		
		//step2: Apply the condition to wait
		wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click ME!"));
		
		eleTextChange.click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
