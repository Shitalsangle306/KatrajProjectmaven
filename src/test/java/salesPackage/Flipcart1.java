package salesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipcart1 {
  @Test
  public void flipcarttest() throws InterruptedException {
	   WebDriver driver = new  ChromeDriver();
	  Reporter.log("opening flipcart",true);
	   driver.get("https://www.flipkart.com/");
	   Thread.sleep(7000);
	   driver.close();
  }
}
