package salesPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Meesho1 {
  @Test
  public void EC_1234_meeshotest() throws InterruptedException 
  {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("myntra opening",true);
	  driver.get("https://www.meesho.com/");
	 // driver.get("https://www.snapdeal.com/");
	  driver.manage().deleteAllCookies();
	  Thread.sleep(7000);
	  driver.close();
  }
}
