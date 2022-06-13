package qa;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("home")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> listReferences = new ArrayList<String>(windowHandles);
		String secondRef = listReferences.get(1);
		driver.switchTo().window(secondRef);
		
		System.out.println(driver.getTitle());
		
		//driver.close(); // to close the 2nd window
		
		driver.switchTo().window(listReferences.get(0));
		
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
