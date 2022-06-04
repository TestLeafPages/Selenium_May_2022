package week4.day1;

import java.awt.Window;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindows {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);

		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		
		String parentWindow = driver.getWindowHandle();

		// get the number of windows
		Set<String> windowHandles = driver.getWindowHandles();

		// Convert set to list
		List<String> windows = new ArrayList<String>(windowHandles);

//		for(int i=0; i< windowHandles.size(); i++) {
//			System.out.println(windows.get(i));
//		}
		
		for (int i = 0; i < windowHandles.size(); i++) {
			driver.switchTo().window(windows.get(i));
			if(driver.getTitle().equals("LeafTaps")) {
				break;
			}
		}

		driver.switchTo().window(windows.get(1));
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindow);
		driver.quit();

	}

}
