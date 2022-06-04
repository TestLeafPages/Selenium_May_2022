package week4.day1;

import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
		
//		Alert alert = driver.switchTo().alert();
//		
//		Thread.sleep(3000);
//		
//		System.out.println(alert.getText());
//		
//		alert.accept();
		
//		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
//		
//		Alert alert = driver.switchTo().alert();
//		
//		System.out.println(alert.getText());
//		
//		alert.dismiss();
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("ABC");
		
		Thread.sleep(5000);
		
		System.out.println(alert.getText());
		
		alert.accept();
		
		
	}

}
