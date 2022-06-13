package qa;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		//WebElement eleFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		//using WeBElement
		//driver.switchTo().frame(eleFrame);
		
		
		//using index
		//driver.switchTo().frame(0);
		
		//using id / name
		//driver.switchTo().frame("frame1");
		
		driver.switchTo().frame("frame2");
		
		WebElement animals = driver.findElement(By.id("animals"));
		
		Select dd = new Select(animals);
		
		dd.selectByVisibleText("Avatar");
		
		
		//to get into the main window
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		
		
		
		
		
		
		
		
		
		
		

	}

}
