package qa;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://erail.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement fromStation = driver.findElement(By.id("txtStationFrom"));

		fromStation.clear();
		fromStation.sendKeys("MAS");
		fromStation.sendKeys(Keys.ENTER);

		WebElement toStation = driver.findElement(By.id("txtStationTo"));

		toStation.clear();
		toStation.sendKeys("NMKL");
		toStation.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		Thread.sleep(2000);
		
		
		List<WebElement> allRows = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		
		int rowSize = allRows.size(); //2
		
		//for (int i = 1; i <= rowSize; i++) {
			
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr[2]/td[2]")).getText();
			System.out.println(text);
		//}
		
		
		
		
		
		
		
		
		

	}

}
