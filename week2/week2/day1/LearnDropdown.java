package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		// Open the browser (chrome)
		ChromeDriver driver = new ChromeDriver();

		// load the url
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// maximize the browser window
		driver.manage().window().maximize();
		
		// 1. Identify the dropdown element (select tag)
		
		WebElement ele = driver.findElement(By.id("dropdown1"));
		// 2. Create an Object for Select class and link with dropdown element
		
		Select dd = new Select(ele);
		// 3. Choose the option
		
		// a) choose the option based on value
//		dd.selectByValue("2");
		
		// b) choose the option based on visible text
//		dd.selectByVisibleText("UFT/QTP");
		
		// c) choose the option based on index
		dd.selectByIndex(1);
	}

}
