package week4.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectMultipleCheckbox {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/checkbox.html");

		driver.manage().window().maximize();
		
		List<WebElement> options = driver.findElements(By.xpath("//label[text()='Select all below checkboxes ']/following-sibling::input"));
		
		// for each loop
		for(WebElement eachOption:options) {
			eachOption.click();
		}
		
		/*
		 * for(int i=0; i< options.size();i++) { options.get(i).click(); }
		 */
		
	}

}
