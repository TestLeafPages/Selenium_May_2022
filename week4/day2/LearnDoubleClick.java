package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDoubleClick {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.myntra.com/");

		driver.manage().window().maximize();
		
		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));
		
		// Create an object for Actions class
		Actions builder = new Actions(driver);
		
		// Double click on Men
//		builder.doubleClick(men).perform();
		
		// Hover on Men
//		builder.moveToElement(men).perform();
		
		// Right click
		builder.contextClick(men).perform();
		
		
		
		
		
		
		
		
		
		
		
	}

}
