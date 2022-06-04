package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='OK']"));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./haja.png");
		FileUtils.copyFile(source, destination);
	}

}
