package challenges;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;

public class Lambdatest {

  public RemoteWebDriver driver = null;
  String username = "hsaidharani";
  String accessKey = "UJT7IUqPVuDYTFr2IxFDf5yiVuwjY3pFTlptd0SRqkslGBQdt0";
	
	@BeforeTest
	public void setUp() throws Exception {
	  DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("browserName", "Safari");
    capabilities.setCapability("version", "14.0");
    capabilities.setCapability("platform", "MacOS Big sur");
    capabilities.setCapability("resolution","1024x768");
	  capabilities.setCapability("build", "First Test");
	  capabilities.setCapability("name", "Sample Test");
	  capabilities.setCapability("network", true); // To enable network logs
	  capabilities.setCapability("visual", true); // To enable step by step screenshot
	  capabilities.setCapability("video", true); // To enable video recording
	  capabilities.setCapability("console", true); // To capture console logs

	  try {
	    driver = new RemoteWebDriver(new URL("https://" + username + ":" + accessKey + "@hub.lambdatest.com/wd/hub"), capabilities);
	  } catch (MalformedURLException e) {
	    System.out.println("Invalid grid URL");
	  }
	}

	@Test(enabled = true)
	public void testScript() throws Exception {
	  try {
	    driver.get("https://login.salesforce.com/");
	 
	    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	    driver.findElement(By.id("password")).sendKeys("Tuna@123");
	    driver.findElement(By.id("login")).click();
	    driver.quit();
	  } catch (Exception e) {
	    System.out.println(e.getMessage());
	  }
	}
}