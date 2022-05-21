package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnEdit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		// Open the browser (chrome)
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("http://www.leafground.com/pages/Edit.html");

		// maximize the browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Haja");
		
		driver.findElement(By.id("email")).clear();
		
		driver.findElement(By.id("email")).sendKeys("Mohideen");
		
		String value = driver.findElement(By.id("email")).getAttribute("value");
		System.out.println(value);
		
		// To check if element is disabled
		boolean enabled = driver.findElement(By.id("email")).isEnabled();
		System.out.println(enabled);
	}

}
