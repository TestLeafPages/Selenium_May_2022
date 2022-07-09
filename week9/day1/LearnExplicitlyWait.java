package week9.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnExplicitlyWait {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/appear.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//step1: Create object for WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(2));
		
		//step2: Apply the condition to wait
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//b[contains(text(),'Voila')]"))));
		
		String text = driver.findElement(By.xpath("//b[contains(text(),'Voila')]")).getText();
		
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
