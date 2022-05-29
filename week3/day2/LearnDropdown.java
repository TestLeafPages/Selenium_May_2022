package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {
	
	/*Classroom Exercise

	1) Launch chrome and go to http://www.leafground.com/pages/Link.html
	2) Get all the links (using findElements)
	3) Click on the first link (using get method with index as 0)
	4) Print the title
	5) Navigate back on the browser (driver.navigate().back())
	6) Get all the links again (using findElements)
	7) Print the count of the links (size)
	8) print the href value (getAttribute) of the second link

	Time: 20 Minutes (max) */

	public static void main(String[] args) {
		
		// setup the driver
		WebDriverManager.chromedriver().setup();

		// Open the browser (chrome)
		ChromeDriver driver = new ChromeDriver();
		
		// implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// maximize
		driver.manage().window().maximize();

		// load the url
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		// findElement --> will return the first matching web element !!
		
		// find all the drop downs
		List<WebElement> allDropdowns = driver.findElements(By.tagName("select"));
		
		// find the count
		System.out.println(allDropdowns.size());
		
		// select the first dropdown 
		WebElement firstDropDown = allDropdowns.get(2);
		
		// Choose
		Select dd = new Select(firstDropDown);
		dd.selectByIndex(4);
		
		
		
		
	}

}
