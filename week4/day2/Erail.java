package week4.day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Erail {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in");

		driver.manage().window().maximize();
		
		// Enter From Station
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MS");
		Thread.sleep(500);
		from.sendKeys(Keys.TAB);
		
		// Enter To Station
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU");
		Thread.sleep(500);
		to.sendKeys(Keys.TAB);
		
		// Deselect sortOnDate checkbox
		if(driver.findElement(By.id("chkSelectDateOnly")).isSelected())
			driver.findElement(By.id("chkSelectDateOnly")).click();
		
		// Get the train names
		int size = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr")).size();
		
		List<String> trainNames = new ArrayList<String>();
		for(int i=1; i<size; i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a")).getText();
			trainNames.add(text);
		}
		
		// Ensure Train names are not duplicated
		Set<String> setTrainNames = new HashSet<String>(trainNames);
		
		if(trainNames.size() == setTrainNames.size()) {
			System.out.println("No Duplicates");
		} else {
			System.out.println("Duplicates found");
		}
		
	}

}
