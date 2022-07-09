package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFluentWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/alertappear.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	
		
		driver.findElement(By.id("alert")).click();
		
		Wait wait = new FluentWait(driver).pollingEvery(Duration.ofMillis(250)).withTimeout(Duration.ofSeconds(2));		
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		
		
		
		
		
		
		
		
	}

}
