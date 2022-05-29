package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomList {
	
	public static void main(String[] args) {
		
		
//		1) Launch chrome and go to http://www.leafground.com/pages/Link.html
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Link.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
//		2) Get all the links (using findElements)
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
//		3) Click on the first link (using get method with index as 0)
		WebElement firstLink = allLinks.get(0);
		firstLink.click();
		
//		4) Print the title
		System.out.println(driver.getTitle());
		
//		5) Navigate back on the browser (driver.navigate().back())
		driver.navigate().back();
		
//		6) Get all the links again (using findElements)
		List<WebElement> allLinks1 = driver.findElements(By.tagName("a"));
		
//		7) Print the count of the links (size)
		System.out.println(allLinks1.size());
		
//		8) print the href value (getAttribute) of the second link
		String href = allLinks1.get(1).getAttribute("href");
		System.out.println(href);
	}

}
