package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapdeal {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://www.snapdeal.com/");

		driver.manage().window().maximize();
		
		WebElement mensFashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		
//		WebElement shirts = driver.findElement(By.xpath("//span[text()='Shirts']"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(mensFashion)
				/*
				 * .pause(1000) .click(shirts)
				 */
		.perform();
		
		driver.findElement(By.xpath("//span[text()='Shirts']")).click();
		
		Thread.sleep(2000);
		
		WebElement firstShirt = driver.findElement(By.xpath("//div[@class='product-tuple-image ']"));
		
		builder.moveToElement(firstShirt).perform();
		
		driver.findElement(By.xpath("//div[contains(text(),'Quick View')]")).click();
	}

}
