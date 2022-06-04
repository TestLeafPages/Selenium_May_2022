package week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");

		driver.manage().window().maximize();
		
//		driver.switchTo().frame(0);
//		// nameOrId
//		// WebElement
//		
//		driver.findElement(By.id("Click")).click();
//		
//		// to get out of all frames
//		driver.switchTo().defaultContent();
//		
//		String text = driver.findElement(By.tagName("h1")).getText();
//		System.out.println(text);
		
		WebElement frameEle = driver.findElement(By.xpath("(//div[@id='wrapframe']/iframe)[2]"));
		
		// first frame
		driver.switchTo().frame(frameEle);
		
		// inner frame
		driver.switchTo().frame("frame2");
		
		driver.findElement(By.id("Click1")).click();
		
		// switch one level back
		driver.switchTo().parentFrame();
		
	}

}
