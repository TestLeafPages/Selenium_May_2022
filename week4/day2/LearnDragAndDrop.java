package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://www.leafground.com/pages/drag.html");

		driver.manage().window().maximize();
		
		WebElement dragEle = driver.findElement(By.id("draggable"));
		
//		WebElement dropEle = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
		
//		builder.dragAndDrop(dragEle, dropEle).perform();
		
//		int x = dropEle.getLocation().getX();
//		int y = dropEle.getLocation().getY();
		
		builder.dragAndDropBy(dragEle, 100, 100).perform();;
		
		
	}

}
