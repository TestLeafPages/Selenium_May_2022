package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSortable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://jqueryui.com/sortable/");

		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		
		Actions builder = new Actions(driver);
//		builder.dragAndDrop(item2, item5).perform();
		
		builder.clickAndHold(item2)
		.moveToElement(item5)
		.release()
		.perform();
	}

}
