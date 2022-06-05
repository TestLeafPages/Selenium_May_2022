package week4.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/table.html");

		driver.manage().window().maximize();
		
//		String text = driver.findElement(By.xpath("//table//tr[3]/td[2]")).getText();
//		System.out.println(text);
		
		// get the size of the rows
		int rowSize = driver.findElements(By.xpath("//table//tr")).size();
		
		// get the size of the columns
		int colSize = driver.findElements(By.xpath("//table//tr//th")).size();
		
		// Iterate through rows and get the text from first column
		for(int i=2; i<= rowSize; i++) {
			
			// if it has changing columns
//			int colSize = driver.findElements(By.xpath("//table//tr["+ i +"]//td")).size();
			
			// Iterate through columns
			for (int j=1; j<=colSize; j++) {
				String text = driver.findElement(By.xpath("//table//tr[" + i + "]/td[" + j + "]")).getText();
				System.out.println(text);
			}
		}
		
	}

}
